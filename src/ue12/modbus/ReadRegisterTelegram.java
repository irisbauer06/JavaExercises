package ue12.modbus;

import java.io.Serial;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class ReadRegisterTelegram extends AbstractModbusTelegram
{
  public ReadRegisterTelegram(
    SimpleSerial serial, int deviceAd, boolean useHoldingRegs,
    int startAd, int quantityRegs, int lengthOfAnswer)
  {
    super(
    serial, deviceAd, useHoldingRegs ? 3 : 4,
    calcXmtData(startAd, quantityRegs), 5 + quantityRegs*2);
  }
   private static byte[] calcXmtData(int startAd, int quantityRegs)
   {
     final byte[] buffer = new byte[4];
     buffer[0] = getHiByte(startAd);
     buffer[1] = getLoByte(startAd);
     buffer[2] = getHiByte(quantityRegs);
     buffer[3] = getLoByte(quantityRegs);
     //TODO
     return buffer;
   }
  
}
