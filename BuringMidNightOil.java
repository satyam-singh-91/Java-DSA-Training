import java.util.*;

public class BuringMidNightOil {
        static int n, k;

    static boolean check(int v) {
        int sum = 0;
        int t = v;

        while (t > 0) {
            sum += t;
            t = t / k;
        }

        return sum >= n;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int l = 1;
        int h = n;
        int ans = n;

        while (l <= h) {
            int mid = (l + h) / 2;

            if (check(mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println(ans);
    }
}

