public class Arrayaverage{
    public static void main(String args[])
    {
        int arr[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println(sum/5);
    }
}