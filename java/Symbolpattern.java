import java.util.Scanner;
public class Symbolpattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char ch = sc.next().charAt(0);
		for(int i=1;i<=a;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print("$");
		    }
		    System.out.println();
		}
	}
}