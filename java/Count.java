import java.io.*;
public class Count
{
	public static void main(String[] args) {
	    Console c = System.console();
	    String str = c.readLine();
	    String[] arr=str.split(" ");
	    System.out.println(arr.length);
	}
}