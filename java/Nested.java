import java.util.Scanner;
public class Nested
{
    public static void main(String[] args){
        try{
            try{
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int res;
                res = a/b;
                System.out.println(res);
            }catch(ArithmeticException e)
            {
                System.out.println(e);
                
            }
            try{
                int arr[] = {3,7,2,5,4};
                for(int i=0;i<6;i++)
                { 
                    System.out.println(arr[i]);
                }
            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                
            }
            while(true){
                try{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the Valid Age");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println(age);
                    break;
                }catch(NumberFormatException e)
                {
                    System.out.println(e);
                }
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}