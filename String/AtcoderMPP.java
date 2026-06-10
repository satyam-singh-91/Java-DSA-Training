package String;

import java.util.*;

public class AtcoderMPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        String ans = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                continue;
            }
            ans += String.valueOf(entry.getKey()).repeat(entry.getValue());
        }
        System.out.println(ans);
        sc.close();

    }
}
