class FindMinMax{
public static void main(String args[])
{

  int len = args.length;  
  int[] arr = new int[len+1];
  for(int i =0;i<len;i++)
   arr[i] = Integer.parseInt(args[i]);
  int max2 = arr[0];
  int min2 = arr[0];
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  int c1 =0;
  int c2 =0;
  for(int i=0;i<len;i++)
  {
     if(arr[i]>max)
     {
        max2 = max;
        max = arr[i];
        c1=i;
     }
     if(arr[i]<min)
     {
        min2 = min;
        min = arr[i];
        c2 =i;
     }
  }
  for(int i=c1;i<len;i++)
  {
      if(arr[i]>max2 && arr[i]!=max)
      {
         max2 = arr[i];
      }
  }
  for(int j =c2;j<len;j++)
  {
      if(arr[j]<min2 && arr[j]!=min)
      {
         min2 = arr[j];
      }
  }
  
  System.out.println("1st max = "+max+" 2nd max = "+max2);
  System.out.println("1st min = "+min+" 2nd min = "+min2);
 }
}