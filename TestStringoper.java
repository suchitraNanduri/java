class TestStringoper
{
  public static void main(String args[])
  {
     //concat func
     String str1 = "Hello folks,";
     String str2 = new String("2.0");
     System.out.println(str1.concat(str2));
     System.out.println(str2.concat(str1));
     // if str1 = str1.concat(str2) -> then str1 will have the concated string
     System.out.println(str1);
     System.out.println(str2);
     //compare func ->return 0 if equal
     String s1 = "Ramchandra";
     String s2 = "Ramesh";
     System.out.println(s1.compareTo(s2));//purely based on ASCII values
     System.out.println(s1.compareToIgnoreCase(s2)); // ignore upper or lower
     String s3 = new String("Ramachandra");
     String s4 = new String("ramaChandrA");
     System.out.println(s1.compareTo(s3));
     System.out.println(s1.compareToIgnoreCase(s4)); 
     //str1.startsWith(str2) (check whether a string start with str2(some substring)
     // str1.endsWith(str2)  (check whether a string end with str2(some substring)
     
  }
}