class searchL{
  public static void main(String args[])
  {
     int flag=0;
     int[] arr = new int[]{4,6,7,14,34,65,87,5,10,2,1};
     int c = Integer.parseInt(args[0]);
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]==c)
          flag = 1;
     }
     if(flag==1)
      System.out.println(c+" is found.");
     else
      System.out.println(-1);
   }
}