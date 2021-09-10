class PrintPrimes
{
 public static void main(String args[])
 {
   int a = Integer.parseInt(args[0]);
   int c = Integer.parseInt(args[1]);
   int i = a;
   int j = 2;
   int x = a;
   if(i % 2 == 0)
   {
      x = x+1;
   }
   else
   {
      x = x;
   }
   for(i=x;i<=c;i+=2)
   {
     int b = (int) Math.sqrt(i);
     for(j=2;j<=b;j++)
     {
       if(i % j == 0)
        {
           break;
        }
     }
     if(j>b)
     { 
      System.out.print(i+" ");
     }
   

   