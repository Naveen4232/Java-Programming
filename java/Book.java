public class Book
{
    String title;
    String author;
    int pages;
    public Book(String str, String str1, int i)
    {
        title  = str;
        author = str1;
        pages  = i;
    }
	public static void main(String[] args) {
	   Book obj = new Book("The Rise","Berlin",1200);
	   System.out.println("The Title of the Book : " + obj.title);
	   System.out.println("The Author of the Book : " + obj.author);
	   System.out.println("Number of Pages in the Book : "+ obj.pages);
}
}