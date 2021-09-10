class maxsum9
{
 public static void main(String args[])
 { 
    int len = args.length;
    int[] arr = new int[10];
    for(int i=0;i<len;i++)
     arr[i] = Integer.parseInt(args[i]);
    int c=0;
    int sum=0;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<len;i++)
    {
      if(arr[i]<min)
      {
         min = arr[i];
         c=i;
      }
    }
    for(int j=0;j<len;j++)
    {
      if(j!=c)
      sum = sum + arr[j];
    }
    System.out.println("Max sum of 9 = "+sum);
  }
}