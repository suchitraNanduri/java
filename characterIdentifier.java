class characterIdentifier{
public static void main(String args[])
{
   char a = args[0].charAt(0);
   if((a >= 'A' && a <= 'Z')||(a >='a' && a <='z'))
   {
    System.out.println("Alphabet");
   }
   else if((int)a >= 48 && (int)a<= 50)
   {
    
     System.out.println("Digit");
   }
   else
   {
     System.out.println("Special Character");
   }
}
}