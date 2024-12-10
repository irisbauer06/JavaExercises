package ue12.modbus;

import java.io.Serial;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class AbstractModbusTelegram implements Telegram
{
  private SimpleSerial serial;
  private final int deviceAd, functionCode;
  private final byte[] xmtData;
  private final int lengthOfAnswer;
    
  public AbstractModbusTelegram(
  SimpleSerial serial, int deviceAd, int functionCode, byte[] xmData,int lengthOfAnswer)
  {
    this.serial = serial;
    this.deviceAd =deviceAd;
    this.functionCode = functionCode;
    this.xmtData = xmData;
    this.lengthOfAnswer = lengthOfAnswer;
  }
  
  
  @Override
  public void send() throws Exception
  {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public byte[] receive() throws Exception
  {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }
  
}
