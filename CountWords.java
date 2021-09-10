import java.util.Scanner;
class CountWord
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String st1=sc.nextLine();
st1 = st1.trim();
int len=st1.length();
int count=0;
for(int i=0;i<len;i++)
{
if(st1.charAt(i)==' ' && st1.charAt(i+1)!=' ')    
count++;
}
System.out.println(count+1);
//System.out.println();
}
}