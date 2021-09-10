class Arraylength
{
  public static void main(String args[])
  {
    int[] source ={100,200,300,400,500,600};
    int[] dest = new int[3];
    System.arraycopy(source, 0 , dest , 0, source.length);
    for(int i=0; i<dest.length ; i++)
    System.out.println("Element at index "+i+":"+dest[i]);
  }
}