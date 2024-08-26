public class Commandline
{
  public static void main (String[]args)
  {
    boolean b = Boolean.parseBoolean(args[0]);
    byte b1 = Byte.parseByte(args[1]);
    int i = Integer.parseInt(args[2]);
    short s = Short.parseShort(args[3]);
    long l = Long.parseLong(args[4]);
    float f = Float.parseFloat(args[5]);
    double d = Double.parseDouble(args[6]);
    String str = args[7];
    char ch = args[7].charAt(0);
    System.out.println("Boolean: "+b);
    System.out.println("Byte: "+b1);
    System.out.println("Integer: "+i);
    System.out.println("Short: "+s);
    System.out.println("Long: "+l);
    System.out.println("Float: "+f);
    System.out.println("Double: "+d);
    System.out.println("String: "+str);
    System.out.println("Character: "+ch);
  }
}