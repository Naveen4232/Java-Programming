import java.util.Scanner;
public class Scannerinputs
{
  public static void main (String[]args) 
  {
    Scanner sc=new Scanner(System.in);
    boolean b = sc.nextBoolean();
    byte b1 = sc.nextByte();
    int i = sc.nextInt();
    short s = sc.nextShort();
    long l = sc.nextLong();
    float f = sc.nextFloat();
    double d = sc.nextDouble();
    String str = sc.next();
    sc.nextLine();
    String str1 = sc.nextLine();
    char ch = sc.nextLine().charAt(0);
    System.out.println("Boolean: "+b);
    System.out.println("Byte: "+b1);
    System.out.println("Integer: "+i);
    System.out.println("Short: "+s);
    System.out.println("Long: "+l);
    System.out.println("Float: "+f);
    System.out.println("Double: "+d);
    System.out.println("String: "+str);
    System.out.println("String: "+str1);
    System.out.println("Character: "+ch);
  }
}