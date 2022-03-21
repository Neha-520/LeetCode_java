public class _763PartitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String s) {
            int[] lastI = new int[26];
            for (int i = 0; i < s.length(); i++) {
                lastI[s.charAt(i) - 'a'] = i;
            }
            List<Integer> res = new ArrayList<>();
            int U = 0;
            for (int i = 0; i < s.length();) {
                int z = U;
                int c = s.charAt(i) - 'a';
                U = lastI[c];
                while (i <= U) {
                    c = s.charAt(i++) - 'a';
                    U = Math.max(U, lastI[c]);
                }
                if (res.size() == 0)
                    res.add(U + 1);
                else
                    res.add(U - z);
            }
            return res;
        }
    }
}
