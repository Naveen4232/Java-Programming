import java.util.Scanner;
public class Average
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int average=0;
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
            average=sum/arr.length;
        }
        System.out.println("The Average value is "+average);
    }
}