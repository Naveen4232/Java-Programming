import java.util.Scanner;
public class Userinputs
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
String s = sc.nextLine();
float f = sc.nextFloat();
double d = sc.nextDouble();
System.out.println(n);
System.out.println(s);
System.out.println(f);
System.out.println(d);
}
}