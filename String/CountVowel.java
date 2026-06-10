package String;
import java.util.*;

public class CountVowel {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }
        System.out.println("Number of vowels in the string is: " + count);
        sc.close(); 
    }
   
}
