import java.util.Scanner;
class CheckAtoZ{
  public static void main(String args[])
  {
    Scanner myObj = new Scanner(System.in);
    System.out.print("Enter String : ");
    String s = myObj.nextLine();
    int[] a = new int[26];
    for(int i=0;i<26;i++)
    {
      int c = s.indexOf((char)(i+(int)'a'));
      int C = s.indexOf((char)(i+(int)'a'));
      char ch = s.charAt(c);
      if(c!=-1 || C!=-1)
      {
         a[(int)ch - 'a'] = 1;
      }
      else
      {
        continue;
      }
    }
}
}
      