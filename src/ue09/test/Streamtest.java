package ue09.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
    try
    {
   
      final Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream
  ("C:\\Users\\iris06\\OneDrive\\Dokumente\\HTL_Kaindorf\\5. Jahrgang\\Informatik\\ABC.txt"), "cp1252"));
      writer.write("ABCDEFGHIJKLMNOPQRSTUVWXYZ\n");
      writer.write("Das ist de zweite Zeile\n");
      writer.write("ÄÖÜäöüß€\n");
      
      writer.close();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
}
