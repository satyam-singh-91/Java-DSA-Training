public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 12, 6, 15, 18 };
        
          for(int i=1;i<arr.length;i++){
            int value = arr[i], j = i - 1;
            while(j >= 0 && arr[j] > value){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
          }
          for(int n:arr){
            System.out.println(n);
          }
    }
}
