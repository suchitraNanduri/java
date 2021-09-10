import java.util.Scanner;
class minusprimeInput{
  public static void main(String args[]) {
   Scanner myObj = new Scanner(System.in);
   int[] arr = new int[10];
   int primecount = 0;
   int a = 0;
   int j = 0;
   do{
     System.out.print("Enter num : ");
     a = myObj.nextInt();
     if( a>0 && a!=1 && a%2!=0 )
     {
       int sq = (int) Math.sqrt(a);
       for(j=2;j<=sq;j++)
       {
         if(a % j == 0)
         {
            break;
         }
       }
      if(j>sq)
      {
        arr[primecount] = a;
        primecount++;
      }
     }
     if(a==2)
     {
       arr[primecount] = a;
        primecount++;
     }
    }while(a!=-1 && primecount<10);
  System.out.print("Prime numbers in array are : ");
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+",");
  }
}
}  