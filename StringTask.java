import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'y') {

                ans=ans+"."+ch;
                
            }
        }

        System.out.println(ans);
        sc.close();
    }
}