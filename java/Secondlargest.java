public class Secondlargest
{
    public static void main(String[] args){
        int arr[]= {7,1,8,5,3,9};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
            }
        }
            System.out.println("The Second Largest Element in the Array is " + arr[1]);
    }
}