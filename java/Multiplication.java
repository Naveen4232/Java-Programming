public class Multiplication
{
	public static void main(String[] args) {
	    int N = Integer.parseInt(args[0]);
	    int multi=0;
	    for(int i=1;i<=10;i++)
	    {
	        multi=i*N;
	        System.out.println(multi);
	    }
	}
}