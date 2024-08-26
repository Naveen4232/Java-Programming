import java.util.Scanner;

public class Anagramsolution {

static boolean isAnagram(String a, String b) {
    if(a.length() == b.length()){
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        char temp;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp; 
                }
            }
        }
        for(int i=0;i<d.length;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i]>d[j]){
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp; 
                }
            }
        }
        for (int i = c.length - 1; i >= 0; i--)   
        {  
            if(c[i]!=d[i]){
                return false;
            }else{
                continue;
            }  
        }  
        return true;
    }
    return false;
}
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}