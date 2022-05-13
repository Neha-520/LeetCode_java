public class _503NextGreaterElementII {
   class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
           int x  = nums[i]; 
           int c = nums.length - 1; 
           int j = i + 1;
           while(c-- > 0){
             if(j >= nums.length) j = 0;
             if(nums[j] > x) {
                 s.push(nums[j]);
                 break;
             }
             j++;  
           }
          if(s.isEmpty()) res[i] = -1;
          else res[i] = s.pop();  
        }
        return res;
    }
} 
}
