import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadingInput
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("give temperature in Cel : ");
      float temp = Float.parseFloat(reader.readLine());
      System.out.println("Today Temperature = "+temp+"Cel");
   }
}