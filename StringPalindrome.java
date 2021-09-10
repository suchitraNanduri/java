import java.util.Scanner;
class StringPalindrome{
  public static void main(String args[])
  {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter String : ");
    String s = myObj.nextLine();
    //String s = "MADAM";
    int l = s.length();
    float m = l/2 ;
    boolean flag = false;
    String ns1="";
    String ns2="";
    for(int i=0;i<m;i++)
    {
        ns1 += s.charAt(i); // for char comparision
        ns2 += s.charAt(l-i-1); 
        if(ns1.compareToIgnoreCase(ns2)==0) // ns1 == ns2
        {
          continue;
        }
        else
        {
          flag = true;
          break;
        }
   }
   if(flag==true)
   {
     System.out.print(s+" "+"->"+" "+"Not Palindrome");
   }
   else
   {
     System.out.print(s+" "+"->"+" "+"Palindrome");
   }
 }
}
      
       

