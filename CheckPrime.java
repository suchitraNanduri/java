
class CheckPrime
{
 
public static void main(String args[])
{
   int a = Integer.parseInt(args[0]);
   int i =2;
   if((a%2==0 && a!=2) || a==1)
   {
     System.out.println("Not Prime");
   }
   else
   {
    float b = (float)Math.sqrt(a);
    for(i=2;i<=b;i++)
    {
      if(a%i==0)
      {
       System.out.println("Not Prime");
       break;
      }
    }
   if(i>b)
    {
    System.out.println("Prime");
    }
   }
 }
}
