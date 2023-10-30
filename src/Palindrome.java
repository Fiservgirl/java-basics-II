import java.util.*;

public class Palindrome {
    static Scanner scan = new Scanner(System.in);
    static String str;
    public static void main(String[] args){
        System.out.println("Please enter the palindrome word");
        str = scan.nextLine();
        int n = str.length();
        for(int i =0; i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                System.out.println("It is palindrome"); 
            }
            else{ 
                System.out.println("It is not palindrome");
            }
        }
    }
    
}
