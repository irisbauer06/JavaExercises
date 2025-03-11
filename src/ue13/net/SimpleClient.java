package ue13.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Client um mit Server zu kommunizieren
 * @author iris06
 */
public class SimpleClient
{
  public static String sendRequestandReceiveResponse(
   final String host, int port, String request)
    throws Exception
  {
    //Namensauflösung
    final InetAddress ipAdr = InetAddress.getByName(host); 
    
    //TCP Verbindung aufbauen
    try (final Socket socket = new Socket(ipAdr, port); )
    {
      //Senden: Request
      final BufferedWriter writer = 
        new BufferedWriter(
          new OutputStreamWriter(socket.getOutputStream(), "utf8"));
      writer.write(request); //Befehl, Datei die geholt werden soll
      writer.newLine();
      writer.newLine();
      writer.flush();
      
      //Erhalten: Response
      final BufferedReader reader = 
        new BufferedReader(
          new InputStreamReader(socket.getInputStream(), "utf8"));
      
      //Zeilen lesen und ausgeben
      final StringBuilder sb = new StringBuilder();
      String line;
      while((line=reader.readLine())!=null) //readLine liefert Zeile ohne \n
        sb.append(line).append("\n"); //sb.append liefert StringBuilder als Rückgabewert -> append kann noch einmal verwendet werden
      return sb.toString();
    }
  }
  
  public static void main(String[] args)
  {
    try
    {
      final String response = 
        SimpleClient.sendRequestandReceiveResponse(
          "127.0.0.1", 8020, "Das ist ein Test-Request");
      System.out.println(response);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}

   /*
      //Namensauflösung
      final InetAddress ipAdr = InetAddress.getByName("www.htl-kaindorf.at");
      //Domainname //liefert IP-Adresse zurück (Datentyp InetAdress)
      System.out.println("Host Adress: " + ipAdr.getHostAddress());
      System.out.println("Host Name: " + ipAdr.getHostName());
      //Adresse angeben mit Host Name
      
      final InetAddress ipAdr2 = InetAddress.getByName("95.143.172.188");
      System.out.println("Host Name 2: " + ipAdr2.getHostName());
      //Name angeben mit IP-Adresse
      
      //TCP Verbindung aufbauen
      try (final Socket socket = new Socket(ipAdr, 80); )
      {
      //An welche Adresse soll die Information, 80 = HTTP Port
      //Verbindung steht (hoffentlich)
      System.out.println("Verbindung steht!");
      //socket.close(); 
      //Braucht Speicher am Rechner, am anderen Rechner, am TCP IP Stack usw. deshalb schließen
      //Fällt weg, wenn in der Automatischen Resourcenmanagement geöffnet
      //Schreiben: Request
      final BufferedWriter writer = 
        new BufferedWriter(
          new OutputStreamWriter(socket.getOutputStream(), "utf8"));
      writer.write("GET /index.html"); //Befehl, Datei die geholt werden soll
      writer.newLine();
      writer.newLine();
      writer.flush();
      //Bytes können mit OutputStream geschickt werden
      //Daten gehen von OutputStream zum socket, socket hat Verbindung mit zweitem Server
      
      //Antwort: Response
      final BufferedReader reader = 
        new BufferedReader(
          new InputStreamReader(socket.getInputStream(), "utf8"));
        String line;
        while((line=reader.readLine())!=null)
          System.out.println(line);
      }
   */