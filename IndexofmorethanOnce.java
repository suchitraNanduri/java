import java.util.Scanner;
class IndexofmorethanOnce
  {
     public static void main(String args[])
        {
  Scanner sc=new Scanner(System.in);
  String st1=sc.nextLine();
  char ch=sc.next().charAt(0);
  if(st1.indexOf(ch)==-1)
    System.out.println("Character is Not Found");
  else if(st1.indexOf(ch)==st1.lastIndexOf(ch))
    System.out.println("Character Occurred Only Once at"+st1.indexOf(ch));
  else
    System.out.println("Character Occurred More than Once at "+st1.indexOf(ch) +"and last at "+st1.lastIndexOf(ch));
        }
  }
