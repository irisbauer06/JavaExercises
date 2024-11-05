package ue09.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author iris06
 */
public class Streamtest
{
  public static void main(String[] args)
  {
    //"Automatisches Ressourcenmanagement" / AutoCloseable"
    try (
      final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream
      ("C:\\Users\\iris06\\OneDrive\\Dokumente\\HTL_Kaindorf\\5. Jahrgang"
        + "\\Informatik\\ABC.txt"), "utf8"));
      )
    {
      //Mit Writer schreiben
      writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ"); writer.newLine();
      writer.write("Das ist de zweite Zeile"); writer.newLine();
      writer.write("ÄÖÜäöüß€"); writer.newLine();
      writer.write("123456789!§$"); writer.newLine();
      
      //writer.close();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();

    }
    //Textdatei lesen
    try (
        final BufferedReader reader =
          new BufferedReader(
          new InputStreamReader
            (new FileInputStream("C:\\Users\\iris06\\OneDrive\\Dokumente\\HTL_Kaindorf\\5. Jahrgang"
        + "\\Informatik\\ABC.txt"), "cp1252")) //
      )
    {
      String line;
      while ((line=reader.readLine())!=null)
        System.out.println(line);
      
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
  
}
