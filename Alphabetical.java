class Alphabetical{
 public static void main(String args[])
  {
     char a = args[0].charAt(0);
     char b = args[1].charAt(0);
    if( a<'a')  
    {
       a = (char)(a+32);
    }
    if(b < 'a')
    {
       b = (char)(b+32);
    }
    if(a > b)
     {
       System.out.println(b+","+a);
     }
    else
     {
       System.out.println(a+","+b);
     }
}
}