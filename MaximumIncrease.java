import java.util.*;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int maximum = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            maximum = Math.max(maximum, count);
        }

        System.out.println(maximum);
        sc.close();
    }
}