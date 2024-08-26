import java.util.*;
public class  Randomnumber{
    public static void main(String[] args) {
        int min = 1; // Minimum value
        int max = 100; // Maximum value

        // Create a Random object
        Random random = new Random();

        // Generate a random number between min and max
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
        for(int i=1;i<=100;i++)
        {
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            if(a>randomNumber)
            {
                System.out.println("too low");
            }
            else if(a<randomNumber)
            {
                System.out.println("too high");
            }
            else if(a==randomNumber)
            {
                System.out.println("Equal");
                break;
            }
        }
    }
}