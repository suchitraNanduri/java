class SampleBitwiseoper{
 public static void main(String nums[])
  {
    int a = Integer.parseInt(nums[0]);
    int b = Integer.parseInt(nums[1]);
    System.out.println("Bitwise AND of"+" "+a+" "+"and"+" "+b+" "+"="+" "+(a & b));
    System.out.println("Bitwise OR of"+" "+a+" "+"and"+" "+b+" "+"="+" "+(a | b));
    System.out.println("Bitwise EXOR of"+" "+a+" "+"and"+" "+b+" "+"="+" "+(a ^ b));
  }
}