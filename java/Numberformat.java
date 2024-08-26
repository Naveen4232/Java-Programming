import java.util.Scanner;
public class Numberformat
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
            System.out.println("Enter the Valid Age");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println(age);
            break;
        }catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        }
    }
}