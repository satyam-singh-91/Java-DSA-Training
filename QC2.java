import java.util.*;

public class QC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            if (n%2==0) {
                int ans=0;
                System.out.println(ans);
            } else {
                System.out.println(x);
            }
        }
        sc.close();
    }
}

