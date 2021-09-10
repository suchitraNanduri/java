class ArthOper{
  public static void main(String args[]){
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     System.out.println("Addition of "+a+" and "+b+" = "+(a+b));
     System.out.println("Subtraction of "+a+" and "+b+" = "+(a-b));
     System.out.println("Multiplication of "+a+" and "+b+" = "+(a*b));
     System.out.println("Division of "+a+" and "+b+" = "+(a/(float)b));
     System.out.println("Modulus of "+a+" and "+b+" = "+(a%(float)b));
   }
}
