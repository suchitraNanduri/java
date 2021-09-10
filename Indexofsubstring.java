import java.util.Scanner;
class Indexofsubstring
  {
     public static void main(String args[])
        {
  Scanner sc=new Scanner(System.in);
  String st1=sc.nextLine();
  String st2=sc.nextLine();
  if(st1.indexOf(st2)==-1)
      System.out.println("Sub String Not Found");
  else
    System.out.println("Found At Index Position :" +st1.indexOf(st2));
        }
  }