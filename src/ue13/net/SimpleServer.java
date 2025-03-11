package ue13.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

/**
 *
 * @author iris06
 */
public class SimpleServer
{
  private final int port;
  private ServerSocket serverSocket = null;
  private HandleRequestThread handleRequestThread = null;

  public SimpleServer(int port)
  {
    this.port = port;
  }
  
  private Socket listen() //"höre", ob Client verbindung aufbauen will
    throws Exception
  {
    return serverSocket.accept();  //akzeptiere eine Verbindungsanfrage -> gibt Socket (Verbindung (zum Client)) zurück
  }
  
  private String readRequest(Socket socket) //Request einlesen
    throws Exception
  {
     final BufferedReader reader = 
        new BufferedReader(
          new InputStreamReader(socket.getInputStream(), "utf8"));
     return reader.readLine();
  }
  
  private String createResponse(String request) //Antwort erzeugen
  {
    return "Ihre Anfrage war: " + request; // Echo Server
  }
  
  private void sendResponse(Socket socket, String response) throws IOException //Antwort senden
  {
      final BufferedWriter writer = 
        new BufferedWriter(
          new OutputStreamWriter(socket.getOutputStream(), "utf8"));
      writer.write(response); //Befehl, Datei die geholt werden soll
      writer.newLine();
      writer.newLine();
      writer.flush();
      socket.shutdownOutput(); //schließe senderichtung in der verbindung
  }
  
  private void handleRequest() throws Exception
  {
    final Socket socket = listen();
    final String
      request = readRequest(socket),
      response = createResponse(request);
    sendResponse(socket, response);
    
  }
  private class HandleRequestThread extends Thread //Thread als innerere Klasse
  {
    @Override
    public void run()
    {
      while (!isInterrupted())
        try
      {
        handleRequest();
      }
      catch (SocketTimeoutException ignore)
      {
        
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }  
    }
  }
  
  public void start() //beginnt auf Verbindungen zu warten
  throws IOException
  {
    if (serverSocket == null)
      serverSocket = new ServerSocket(port);   //man wartet auf Verbindung mit bestimmten Port
    //wenn es schon serverSocket auf diesem Port gibt, dann wird Exception geworfen
      handleRequestThread = new HandleRequestThread();
      handleRequestThread.start();
      
  }
  
  public void stop()  //stoppen von warten auf Verbindungen
  throws Exception
  {
    handleRequestThread.interrupt(); //Bitte den Thread, sich selbst zu beenden
    handleRequestThread.join(3_000); 
    serverSocket.close();
    serverSocket = null;
  }
  
  public static void main(String[] args)
  {
    try
    {
      final SimpleServer server = new SimpleServer(8020); 
      System.out.println("Server-Objekt erzeugt");
      
      server.start();
      System.out.println("Server gestartet");
   
      Thread.sleep(30_000);
      
      server.stop();
      System.out.println("Server gestoppt");
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  
}
