import java.util.Scanner;
public class Customexception
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            if(a%2!=0)
            {
                throw new MyCustomException("The Given Number is a Odd Number.");
            }
        }catch(MyCustomException e)
        {
            System.out.println("Custom Exception Caught : " + e.getMessage());
        }
    }
}
class MyCustomException extends Exception{
    public MyCustomException()
    {
        super();
    }
    public MyCustomException(String message){
        super(message);
    }
}
