class CharcterarrayvsString{
 public static void main(String args[]){
   char[] chararray = {'S','U','C','H','I','T','R','A'};
   String ostring   = new String(chararray);
   System.out.println(chararray);//we can access through index
   System.out.println(ostring);
   //ostring[1] ->throws error
   System.out.println(chararray[0]);
   //System.out.println(ostring[0]);
   //System.out.println(ostring.length); ->giving error?
   System.out.println(chararray.length);
  }
} 