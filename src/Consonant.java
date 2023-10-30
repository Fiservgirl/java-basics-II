import java.util.*;

public class Consonant {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int vowels = 0;
        char[] vowelList = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Please enter a word");
        String input = scan.nextLine();
        int consonants = 0;
            for(int j=0; j<input.length();j++){
            if(input.charAt(j)==vowelList[j]){    
                vowels++;
            }
            else if(input.charAt(j)!=vowelList[j]){
                consonants++;
            }
            }
                
        System.out.println("The word has "+ vowels +" vowels and has " + consonants + " consonants");
    }

}
