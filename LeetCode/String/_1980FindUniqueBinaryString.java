class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '1') {
                ans.append("0");
            } else {
                ans.append("1");
            }
        }
        return ans.toString();
    }
}

// using Backtracking-----------------------

class Solution2 {
    String res;

    public String findDifferentBinaryString(String[] nums) {
        List<String> l = new ArrayList<>(Arrays.asList(nums));
        helper(l, nums, nums.length, "");
        return res;
    }

    void helper(List<String> l, String[] nums, int size, String s) {
        if (size == s.length()) {
            if (!l.contains(s))
                res = s;
            return;
        } else {
            helper(l, nums, size, s + "1");
            helper(l, nums, size, s + "0");
        }
    }
}