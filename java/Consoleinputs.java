import java.io.Console;
public class Consoleinputs
{
  public static void main (String[]args)
  {
    Console c = System.console();
    boolean b = Boolean.parseBoolean(c.readLine());
    byte b1 = Byte.parseByte(c.readLine());
    int i = Integer.parseInt(c.readLine());
    short s = Short.parseShort(c.readLine());
    long l = Long.parseLong(c.readLine());
    float f = Float.parseFloat(c.readLine());
    double d = Double.parseDouble(c.readLine());
    String str = c.readLine();
    char ch = c.readLine().charAt(0);
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