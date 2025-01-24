package ue12.modbus;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serial;
import ue12.serial.SimpleSerial;

/**
 *
 * @author iris06
 */
public class AbstractModbusTelegram implements Telegram
{
  private final SimpleSerial serial;
  private final int deviceAd, functionCode;
  private final byte[] xmtData;
  private final int lengthOfAnswer;
  private final byte[] rcvData;
  
  public byte[] getRcvData()
  {
    return rcvData;
  }
    
  public AbstractModbusTelegram(
  SimpleSerial serial, int deviceAd, int functionCode, byte[] xmtData,int lengthOfAnswer)
  {
    this.serial = serial;
    this.deviceAd =deviceAd;
    this.functionCode = functionCode;
    this.xmtData = xmtData;
    this.lengthOfAnswer = lengthOfAnswer;
    rcvData = new byte[lengthOfAnswer-4];
  }
  private static int calcCrc(byte[] data,int start,int cnt)
   {
     int crc=0xFFFF;
     for (int i=start; i<start+cnt; i++)
       crc = crc16 (crc, data[i]);
     return crc;
   }

   private static int crc16(int crc,int data)
   {
     final int poly16 = 0xA001;
     int lsb;
     crc = ((crc ^ data) | 0xFF00) & (crc | 0x00FF);
     for (int i = 0; i < 8; i++)
     {
       lsb = (crc & 0x0001);
       crc >>= 1;
       if (lsb!=0)
           crc ^= poly16;
     }
     return crc;
   }
  protected static byte getLoByte(int value)
  {
    return (byte)(value & 0xFF);
  }
  protected static byte getHiByte(int value)
  {
    return getLoByte(value >> 8);
  }
  
  private void log(String what, byte[] data)
  {
    System.out.print(what+": ");
    for (byte b: data)
      System.out.format(" %02X", b);
  }

   
  @Override
  public void send() throws Exception
  {
    serial.purge(); //Empfangspuffer leeren
    final byte[] buffer = new byte[xmtData.length+4]; //Sendepuffer anfordern
    buffer[0] = (byte)deviceAd;                        //Busadresse
    buffer[1] = (byte)functionCode;                   //Function Code
    System.arraycopy(xmtData,0, buffer, 2, xmtData.length); //Nutzdaten
    final int crc16 = calcCrc(buffer,0,xmtData.length+2);
    buffer[buffer.length-2] = getLoByte(crc16);
    buffer[buffer.length-1] = getHiByte(crc16);
    final OutputStream os = serial.getOutputStream();
    os.write(buffer);
    os.flush();
    log("XMT", buffer);
    
  }

  @Override
  public byte[] receive() throws Exception
  {
    final InputStream is = serial.getInputStream(); //InputStream holen
    final byte[] buffer = new byte[lengthOfAnswer];
    is.read(buffer);
    if (buffer[0] != deviceAd)
      throw new Exception("Invalid device address");
    if (buffer[1] != functionCode)
      throw new Exception("Invalid function code");
    final int crc16 = calcCrc(buffer, 0, rcvData.length+2);
    final int loByte = getLoByte(crc16), hiByte = getHiByte(crc16);
    if (loByte != buffer[buffer.length-2] || hiByte!=buffer[buffer.length-1])
      throw new Exception("wrong crc16!");
    
    System.arraycopy(buffer, 2, rcvData, 0, rcvData.length);
    //Checksumme überprüfen dann Empfangen fertig
  return rcvData;
  } 
  
 
}
