class discardsum67{
  public static void main(String args[])
  {
      int len = args.length;
      int[] arr = new int[len];
      for(int i=0;i<len;i++)
      {
         arr[i] = Integer.parseInt(args[i]);
      }
      int sum = 0;
      int sum6 = 0;
      boolean mark6 = false;
      boolean mark7 = true;
      for(int i=0;i<len;i++)
      { 
         sum+ =arr[i];
         if(arr[i] == 7)
         {
           mark7 = true;
         }
         if(arr[i] == 6)
         {
           mark6 = true;
         }
                  
      
            