public class Arrayindex
{
    public static void main(String[] args){
        int arr[] = {5,8,2,9,4};
        try{
            for(int i=0;i<6;i++)
        { 
            System.out.println(arr[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
