class CheckEven
{
  public static void main(String args[])
  {
    int a = Integer.parseInt(args[0]);
    if(a % 2 ==0)
     { 
       System.out.println(a+" "+"IS EVEN");
     }
    else
     {
       System.out.println(a+" "+"IS ODD");
     }
 }
}