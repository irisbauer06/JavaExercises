package ue12;

import com.fazecast.jSerialComm.SerialPort;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author iris06
 */
public class SimpleSerial implements AutoCloseable
{
  private final SerialPort serialPort;
  private OutputStream outputStream;
  private InputStream inputStream;
  
  public SimpleSerial(String portName)
  {                         //Factory-Methode
    serialPort = SerialPort.getCommPort(portName);
  }
  
  public void open() throws Exception
  {
    if (!serialPort.openPort())
      throw new Exception("Fehler beim Öffnen der Schnittstelle!");
   OutputStream outputStream = serialPort.getOutputStream();
   InputStream inputStream = serialPort.getInputStream();

  }
  
   public void close() throws Exception
  {
    if (!serialPort.closePort())
      throw new Exception("Fehler beim Schliessen der Schnittstelle!");
    
  }

  //Delegate Methode
  public final boolean setComPortParameters(int newBaudRate, int newDataBits, int newStopBits, int newParity)
  {
    return serialPort.setComPortParameters(newBaudRate, newDataBits, newStopBits, newParity);
  }
  
  public final synchronized boolean setComPortTimeouts(int ms)
  {
    return serialPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_BLOCKING,
      ms, 0);
  }

  public void purge()
    throws Exception
  {
    while (inputStream.available() > 0)
      inputStream.read();
  }
  public SerialPort getSerialPort()
  {
    return serialPort;
  }

  public OutputStream getOutputStream()
  {
    return outputStream;
  }

  public InputStream getInputStream()
  {
    return inputStream;
  }
  
  public static List<String> findSerialPorts()
  {
    final List<String> portNames = new ArrayList<>();
    SerialPort[]ports = SerialPort.getCommPorts();
    for (SerialPort port : ports)
      portNames.add(port.getSystemPortName());
    return portNames;
  }
  
  public static void main(String[] args)
  {
    final List<String> portNames =SimpleSerial.findSerialPorts();
    System.out.format("%d serielle Schnittstelle gefunden!", portNames.size());
    for (String portName : portNames)
      System.out.print(portName);
    
    try (final SimpleSerial serial = new SimpleSerial("COM6"))
    {
      serial.open();
      serial.setComPortParameters(9600, 8,
        SerialPort.ONE_POINT_FIVE_STOP_BITS, SerialPort.EVEN_PARITY);
      serial.setComPortTimeouts(1_000);
      serial.purge();
      serial.getOutputStream().write(65);
      final int naechstesGelesenesByte = serial.getInputStream().read();
      serial.close();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
    

    
    
  }
}
