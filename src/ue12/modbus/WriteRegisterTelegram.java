package ue12.modbus;

import com.fazecast.jSerialComm.SerialPort;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class WriteRegisterTelegram extends AbstractModbusTelegram
{
  public WriteRegisterTelegram(
    SimpleSerial serial, int deviceAd, int functionCode, int regAd, int value)
  {
    super(serial, deviceAd, 6, calcXmtData(regAd, value),8);
  }
  
  private static byte[] calcXmtData(int regAd, int value)
   {
    final byte[] buffer = new byte[4];
    buffer[0] = getHiByte(regAd);
    buffer[1] = getLoByte(regAd);
    buffer[2] = getHiByte(value);
    buffer[3] = getLoByte(value);
    return buffer;
   }
  public static void main(String[] args)
  {
    try (final SimpleSerial serial = new SimpleSerial("ttyUSB0"))
    {
      serial.open();
      serial.setComPortParameters(57600, 8,
        SerialPort.TWO_STOP_BITS, SerialPort.NO_PARITY);
      serial.setComPortTimeouts(5_000);
      
      final WriteRegisterTelegram telegram =
        new WriteRegisterTelegram(serial, 2, 1, 4711);
      telegram.send();
      telegram.receive();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  
}
