public class Constructor
{
    String name;
    int age;
    public Constructor(String str,int i)
    {
        name = str;
        age = i;
    }
    public Constructor(Constructor person3)
    {
        name = person3.name;
        age = person3.age;
    }
	public static void main(String[] args) {
	   Constructor person1 = new Constructor("Kishore",36);
	   Constructor person2 = new Constructor(person1);
	   System.out.println("Person Name is " + person1.name);
	   System.out.println("Person Age is " + person1.age);
	   System.out.println("Person Name is " + person2.name);
	   System.out.println("Person Age is " + person2.age);
	}
}