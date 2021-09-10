import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StuInfo
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Registration number : ");
      int Regno = Integer.parseInt(reader.readLine());
      System.out.print("Enter Number of Subjects : ");
      int NoSub = Integer.parseInt(reader.readLine());
      int[] Sub = new int[NoSub];
      System.out.print("Enter Marks in Each Sub: ");
      float sum = 0;
      for(int i=0;i<NoSub;i++)
      {
         Sub[i] = Integer.parseInt(reader.readLine());
         sum+=Sub[i];
      }
      float avg;
      avg = sum/NoSub ;
      float percent;
      percent = (sum/(NoSub*100))*100 ;
      System.out.println(Regno +" "+"Student"+" "+"Total = "+sum);
      System.out.println(Regno +" "+"Student"+" "+"Average = "+avg);
      System.out.println(Regno +" "+"Student"+" "+"Percentage = "+percent);

   }
}