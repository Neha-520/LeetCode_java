public class _985SumOfEvenNumbersAfterQueries {
    class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int x = 0;
         for(int n : nums){
            if(n % 2 == 0) x += n; 
        }
        int res[] = new int[nums.length];
        int i = 0;
        for(int[] q: queries){
            if(nums[q[1]] % 2 == 0) x -= nums[q[1]];
            nums[q[1]] +=  q[0];
            if(nums[q[1]] % 2 == 0) x += nums[q[1]];
            res[i++] = x;
        }
        return res;
    }
}
}
