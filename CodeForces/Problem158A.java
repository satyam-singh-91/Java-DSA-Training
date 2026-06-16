package CodeForces;

import java.util.*;

public class Problem158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int kth = arr[k - 1];
        int count = 0;

        for (int score : arr) {
            if (score > 0 && score >= kth) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}