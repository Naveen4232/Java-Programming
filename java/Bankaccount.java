public class Bankaccount
{
    String name;
    long number;
    double balance;
    public Bankaccount(String str,long l)
    {
        name = str;
        number = l;
    }
	public static void main(String[] args) {
	   Bankaccount person1 = new Bankaccount("Kishore",363456789);
	   System.out.println("Account Holder Name is " + person1.name);
	   System.out.println("Account Number : " + person1.number);
	}
}
