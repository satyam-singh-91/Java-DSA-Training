public class Selection {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 8, 1, 4, 6, 2, 8 };
        
        for(int i=0;i<arr.length;i++){
            int value = arr[i], min = i;
            for(int j=i+1;j<arr.length;j++){
                if(value > arr[j]){
                    value = arr[j];
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    for(int n:arr){
    System.out.println(n);
    }
    }
}