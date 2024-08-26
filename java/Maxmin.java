public class Maxmin
{
    public static void main(String[] args){
        double arr[]= {7.5,2.3,8.6,5.0,3.4,9.1};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
            }
        }
            System.out.println(arr[0]);
            System.out.println(arr[5]);
    }
}