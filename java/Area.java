import java.util.Scanner;
public class Area
{
  public static void main (String[]args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base of a triangle: ");
    int a=sc.nextInt();
    System.out.println("Enter the height of a triangle: ");
    int b=sc.nextInt();
    int area=(a*b)/2;
    System.out.println("The caculated area of a triangle is "+area);
  }
}