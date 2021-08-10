package Arrays;

import java.util.HashSet;

public class ContainsDuplicates {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> x = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (x.contains(nums[i]))
                    return true;
                x.add(nums[i]);
            }
            return false;
        }
    }
}
