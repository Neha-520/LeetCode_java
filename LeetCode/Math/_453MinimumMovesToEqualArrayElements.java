class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE, moves = 0;
        for (int i : nums)
            min = Math.min(min, i);
        for (int i = 0; i < nums.length; i++)
            moves += (nums[i] - min);
        return moves;
    }
}

class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE,sum = 0;
        for (int i : nums) {
            min = Math.min(min, i);
            sum += i;
        }      
        return sum - (nums.length * min);
    }
}