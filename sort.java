class sort{
 public static void main(String args[])
 {
   int[] arr = new int[]{4,6,7,14,34,65,87,5,10,2,1};
   int temp = 0;
   int i = 1;
   int j = 0;
   int n = arr.length;
   for(i=1;i<n;i++)
   {
       temp = arr[i];
       j = i-1;
       while( (j>=0) && (temp < arr[j]))
       {
          arr[j+1] = arr[j];
          j = j-1;
       }
       arr[j+1] = temp;
   }
   for(int k=0;k<n;k++)
    System.out.print(arr[k]+" ");
  }
}

          