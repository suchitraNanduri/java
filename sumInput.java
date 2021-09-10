import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sumInput
{
   public static void main(String args[]) throws IOException
   {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter a : ");
      int a = Integer.parseInt(reader.readLine());
      System.out.print("Enter b : ");
      int b = Integer.parseInt(reader.readLine());
      System.out.println("Sum of numbers = "+(a+b));
  }
}