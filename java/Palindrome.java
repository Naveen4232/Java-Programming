import java.io.*;
public class Palindrome
{
	public static void main(String[] args) {
	    Console c = System.console();
	    String str = c.readLine();
	    String str2="";
	    for(int i=str.length()-1;i>=0;i--)
		 str2+=str.charAt(i);
		 if(str2.equals(str)){
		     System.out.println("Palindrome");
		 }
		 else
		 System.out.println("Not a Palindrome");
	}
}