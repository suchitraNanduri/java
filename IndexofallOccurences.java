import java.util.Scanner;
class IndexofallOccurences
  {
     public static void main(String args[])
        {
  Scanner sc=new Scanner(System.in);
  String st1=sc.nextLine();
  char ch=sc.next().charAt(0);
        int i = st1.indexOf(ch);
        int len = st1.length();
        System.out.print(i+" ");
        do{
            
            i = st1.indexOf(ch,i+1);
            if(i!=-1)
            System.out.print(i+" ");
         
        }while(i!=-1);
       
  }
}