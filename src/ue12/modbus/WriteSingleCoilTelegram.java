package ue12.modbus;

import com.fazecast.jSerialComm.SerialPort;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class WriteSingleCoilTelegram extends AbstractModbusTelegram
{
  public WriteSingleCoilTelegram(SimpleSerial serial, int deviceAd, int coilAd, boolean value)
  {
    super(serial, deviceAd, 5, calcXmtData(coilAd, value), 8);
  }
  
  private static byte[] calcXmtData(int coilAd, boolean value)
  {
    final byte[] xmtData = new byte[4];
    xmtData[0] = getHiByte(coilAd);
    xmtData[1] = getLoByte(coilAd);
    xmtData[2] = value ? (byte)0xFF : 0;
    xmtData[3] = 0;
    return xmtData;
  }
  public static void main(String[] args)
  {
    try (final SimpleSerial serial = new SimpleSerial("ttyUSB"))
    {
      serial.open();
      serial.setComPortParameters(57600, 8, SerialPort.TWO_STOP_BITS, SerialPort.NO_PARITY);
      serial.setComPortTimeouts(5_000);
      
      for (int i=0;i<1_000;i++)
      {
        final WriteSingleCoilTelegram telegram =
        new WriteSingleCoilTelegram(serial, 2, 1, (i%2)==0);
        
      telegram.send();
      telegram.receive();
      Thread.sleep(250);
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

  }
}
