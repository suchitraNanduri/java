class SampleShiftoper{
 public static void main(String args[])
  {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     System.out.println("Right shift of "+a+" by "+b+" = "+(a>>b));
     System.out.println("Left shift of "+a+" by "+b+" = "+(a<<b));
  }
}