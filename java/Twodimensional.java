import java.util.Scanner;
public class Twodimensional
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[2][3];
        int add=0;
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
            add+=arr[i][j];
        }
        }
        System.out.println(add);
    }
}