class PrintPrimes
{
 public static void main(String args[])
 {
   int a = Integer.parseInt(args[0]);
   int i = 3;
   int j = 2;
   System.out.print(2+" ");
   for(i=3;i<a;i+=2)
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
   }
}
}
   