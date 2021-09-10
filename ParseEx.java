class ParseEx{
  static public void main(String[] args){
    int i1 = Integer.parseInt(args[0]);
    int i2 = Integer.parseInt(args[1]);
    int i3 = Integer.parseInt(args[2],2);
    System.out.println(i1+i2);
    System.out.println(i1+i2+20);
    System.out.println(i3);
  }
}
