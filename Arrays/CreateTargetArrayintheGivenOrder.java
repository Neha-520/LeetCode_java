package Arrays;

import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                a.add(index[i], nums[i]);
            }
            int[] x = new int[nums.length];
            for (int i = 0; i < x.length; i++) {
                x[i] = a.get(i);
            }
            return x;
        }
    }
}
