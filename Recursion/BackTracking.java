package Recursion;

import java.util.*;

public class BackTracking {

    static void findSubsets(int[] arr, int s, List<Integer> temp) {

        if (s == arr.length) {
            System.out.println(temp);
            return;
        }

        // Include current element
        temp.add(arr[s]);
        findSubsets(arr, s + 1, temp);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Exclude current element
        findSubsets(arr, s + 1, temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        findSubsets(arr, 0, new ArrayList<>());
    }
}