public class _2053KthDistinctStringinArray {
    class Solution {
        public String kthDistinct(String[] arr, int k) {
            Map<String, Integer> map = new HashMap<>();
            for (String s : arr)
                map.put(s, map.getOrDefault(s, 0) + 1);
            for (String s : arr) {
                if (map.get(s) == 1) {
                    if (k > 1)
                        k--;
                    else
                        return s;
                }
            }
            return "";
        }
    }
}
