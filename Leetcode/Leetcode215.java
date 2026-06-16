import java.util.Arrays;
class Leetcode215 {
    public int findKthLargest(int[] nums, int k) {
       /* PriorityQueue<Integer>PQ=new PriorityQueue<>();

       for(int i=0;i<k;i++){
        PQ.add(nums[i]);
       }


       for(int i=k;i<nums.length;i++){
        if(PQ.size() >= k && PQ.peek()<nums[i]){
            PQ.poll();
            PQ.add(nums[i]);
        }
       }
            return PQ.peek();
 */

 Arrays.sort(nums);
 return nums[nums.length-k];
    }
}