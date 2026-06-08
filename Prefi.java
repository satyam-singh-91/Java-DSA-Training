import java.util.*;

public class Prefi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();

        }
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {

            int l = sc.nextInt();
            int r = sc.nextInt();
            l = l - 1;
            r = r - 1;
            int sum = prefix[r];
            if(l > 0){
                sum = sum - prefix[l-1];
            }

            System.out.println("sum is l to r is " + sum);
        }
        sc.close();
    }
}