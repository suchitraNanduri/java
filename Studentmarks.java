import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Studentmarks{
   public static void main(String args[]) throws IOException
   {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Student marks in Sub1 : ");
      float s1 = Float.parseFloat(reader.readLine());
      System.out.print("Enter Student marks in Sub2 : ");
      float s2 = Float.parseFloat(reader.readLine());
      System.out.print("Enter Student marks in Sub3 : ");
      float s3 = Float.parseFloat(reader.readLine());
      System.out.println("Average of Subjects = "+((s1+s2+s3)/3));
  }
}