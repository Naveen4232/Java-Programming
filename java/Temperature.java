import java.io.*;
public class Temperature
{
	public static void main(String[] args) {
		Console c=System.console();
		double degree=Double.parseDouble(c.readLine());
		String con=c.readLine();
		Temperature obj=new Temperature();
		String r1="celtofah";
		String r2="fahtocel";
		if(con.equals(r1)){
		    obj.celtofah(degree);
		}
		else if(con.equals(r2)){
		    obj.fahtocel(degree);
		}
	}
	void celtofah(double C){
	    System.out.println((C*9/5)+32);
	}
	void fahtocel(double C){
	    System.out.println((C-32)/1.8);
	}
}