package ue12.modbus;

/**
 *
 * @author iris06
 */
public interface Telegram
{
  void send() throws Exception;
  byte[] receive() throws Exception;
}
