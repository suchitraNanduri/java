import java.util.Scanner;
class ConvertStringCase{
  public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String : ");
       String s = sc.nextLine();
       System.out.println("Upper Case : " + s.toUpperCase()); //will not modify the original string only returns the uppercase
       System.out.println("Lower Case : " + s.toLowerCase());
       // if we want to reflect the returned value to original we should do s = s.toUpperCase() or lower
       System.out.println("Original string = " + s);
   }
}