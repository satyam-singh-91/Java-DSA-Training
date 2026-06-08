public class SumSubArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0};
        int k=2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        
    }
}
