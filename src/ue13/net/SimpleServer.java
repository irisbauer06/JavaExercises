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
  }
  
  private void handleRequest() throws Exception
  {
    final Socket socket = listen();
    final String
      request = readRequest(socket),
      response = createResponse(request);
    sendResponse(socket, response);
    
  }
  
  public void start() //beginnt auf Verbindungen zu warten
  throws IOException
  {
    if (serverSocket == null)
      serverSocket = new ServerSocket(port);   //man wartet auf Verbindung mit bestimmten Port
    //wenn es schon serverSocket auf diesem Port gibt, dann wird Exception geworfen
  }
  
  public void stop()  //stoppen von warten auf Verbindungen
  throws IOException
  {
    serverSocket.close();
    serverSocket = null;
  }
  
}
