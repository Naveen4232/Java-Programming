public class Parameterized
{
    String name;
    int rank;
    public Parameterized(String str,int i)
    {
        name = str;
        rank = i;
    }
	public static void main(String[] args) {
	   Parameterized person1 = new Parameterized("Raju",2);
	   System.out.println("Person Name : " + person1.name);
	   System.out.println("Class Rank : " + person1.rank);
	}
}