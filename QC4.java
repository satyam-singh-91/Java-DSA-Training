import java.util.*;

public class QC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int  a = sc.nextInt();
                int key = a - i;
                int count = freq.getOrDefault(key, 0);
                ans += count;
                freq.put(key, count + 1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
