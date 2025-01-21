package ue12.modbus;

import com.fazecast.jSerialComm.SerialPort;
import java.io.Serial;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class ReadRegisterTelegram extends AbstractModbusTelegram
{
  private int startAd;
  public ReadRegisterTelegram(
    SimpleSerial serial, int deviceAd, boolean useHoldingRegs,
    int startAd, int quantityRegs, int lengthOfAnswer)
  {
    super(
    serial, deviceAd, useHoldingRegs ? 3 : 4,
    calcXmtData(startAd, quantityRegs), 5 + quantityRegs*2);
    this.startAd = startAd;
  }
   private static byte[] calcXmtData(int startAd, int quantityRegs)
   {
     final byte[] buffer = new byte[4];
     buffer[0] = getHiByte(startAd);
     buffer[1] = getLoByte(startAd);
     buffer[2] = getHiByte(quantityRegs);
     buffer[3] = getLoByte(quantityRegs);
     return buffer;
   }
   
   public int getRegister(int adr)
   {
     final byte[] rcvBuf = getRcvData();
     final int index = (adr-startAd)*2;      //TODO: PLAUSI
     final int
      loByte = rcvBuf[index],
      hiByte = rcvBuf[index+1];
    return (hiByte<<8) | loByte;
   }
   
   public static void main(String[] args)
  {
    try (final SimpleSerial serial = new SimpleSerial("ttyUSB0"))
    {
      serial.open();
      serial.setComPortParameters(57600, 8,
        SerialPort.TWO_STOP_BITS, SerialPort.NO_PARITY);
      serial.setComPortTimeouts(5_000);
      
      final ReadRegisterTelegram telegram =
        new ReadRegisterTelegram(serial, 2, false, 0x30, 4);
      telegram.send();
      telegram.receive();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

  }
  
}
