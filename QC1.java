import java.util.*;

public class QC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n= sc.nextInt();
            int x[] = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }
            Arrays.sort(x);
            int blueSum=0;
            int redSum=0;
            int blueCount=0;
            int redCount=0;
            for(int i=2;i<n-2;i++){
                blueSum=blueSum+x[0]+x[1];
                redSum=redSum+x[n-1];
                blueCount=blueCount+2;
                redCount=redCount+1;
                if(blueSum>redSum && blueCount>redCount){
                    blueSum+=x[i];
                    blueCount++;
                    redSum+=x[n-2];
                    redCount++;
                }
            }
            
        }
        sc.close();
    }
}
