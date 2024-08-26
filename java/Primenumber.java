public class Primenumber
{
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int j=0;
		for(int i=2;i<=N;i++)
		{
		    if(N%i==0)
		    {
		        j++;
		    }
		}
		if(j==1)
		{
		    System.out.print("Primenumber");
		}
		else{
		    System.out.print("Not a Primenumber");
		}
	}
}
