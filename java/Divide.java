import java.util.Scanner;
public class Divide
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res;
        try{
            res = a/b;
            System.out.println(res);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}