package ue12;

import com.fazecast.jSerialComm.SerialPort;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author iris06
 */
public class SimpleSerial
{
  private final SerialPort serialPort;
  
  public SimpleSerial(String portName)
  {                         //Factory-Methode
    serialPort = SerialPort.getCommPort(portName);
  }
  
  public void open() throws Exception
  {
    if (!serialPort.openPort())
      throw new Exception("Fehler beim Öffnen der Schnittstelle!");
    
  }
  
  public void close() throws Exception
  {
    if (!serialPort.closePort())
      throw new Exception("Fehler beim Schließen der Schnittstelle!");
    
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
    
  }
}
