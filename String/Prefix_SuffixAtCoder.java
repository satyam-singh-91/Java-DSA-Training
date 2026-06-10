package String;

import java.util.*;

public class Prefix_SuffixAtCoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next();// length of N
        String t = sc.next();// length of M

        boolean pref = true;
        boolean suff = true;

        for (int i = 0; i < n; i++) {
            if (t.charAt(i) != s.charAt(i)) {
                pref = false;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (s.charAt(j) != t.charAt(m - n + j)) {
                suff = false;
                break;
            }
        }

        if (pref && suff)
            System.out.println(0);
        else if (pref)
            System.out.println(1);
        else if (suff)
            System.out.println(2);
        else
            System.out.println(3);
        sc.close();
    }
}
