class Test{
  public static void main(String args[]){
    byte b=-128;
    double f=1.2;
    boolean c=true;
    float a1=1f;
    float a2=1.2f;
    float a3=1.2345f;
    float a4=987654321.1234567f;
    float a5=6.123453210f;
    double a6 = 987654321.1234567;
    double a7=6.123453210;
    int convert = (int) a6;
    int a0=10,b0=017,c0=0X3A;
    int x=97;
    char c1= (char)x;
    System.out.println("Byte: "+b);
    System.out.println("Double: " +f);
    System.out.println("Boolean: "+c);
    System.out.println("float nums: " +a1);
    System.out.println(a2);
    System.out.println(a3);
    System.out.println("trying value after. = " +a4);
    System.out.println("Using Double =" +a6);
    System.out.println("more than 7 after. = " +a5);
    System.out.println("Using Double =" +a7);
    System.out.println("add ="+a0+","+b0+","+c0);
    System.out.println("converting = "+convert);
    System.out.println("int (97) -> char = " + c1);    
}
}