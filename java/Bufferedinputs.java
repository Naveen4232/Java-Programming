import java.io.*;
public class Bufferedinputs
{
  public static void main (String[]args) throws IOException
  {
    BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));
    boolean boo = Boolean.parseBoolean(b2.readLine());
    byte bt = Byte.parseByte(b2.readLine());
    int i = Integer.parseInt(b2.readLine());
    short s = Short.parseShort(b2.readLine());
    long l = Long.parseLong(b2.readLine());
    float f = Float.parseFloat(b2.readLine());
    double d = Double.parseDouble(b2.readLine());
    String str = b2.readLine();
    char ch = b2.readLine().charAt(0);
    System.out.println("Boolean: "+boo);
    System.out.println("Byte: "+bt);
    System.out.println("Integer: "+i);
    System.out.println("Short: "+s);
    System.out.println("Long: "+l);
    System.out.println("Float: "+f);
    System.out.println("Double: "+d);
    System.out.println("String: "+str);
    System.out.println("Character: "+ch);
  }
}