public class _438FindAllAnagramsInString {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int j = p.length();
            int i = 0, n = s.length();
            int[] f1 = new int[26];
            for (int t = 0; t < p.length(); t++)
                f1[p.charAt(t) - 'a']++;

            List<Integer> l = new ArrayList<>();
            while (j <= n) {
                String x = s.substring(i, j);
                int f2[] = new int[26];
                for (int t = 0; t < x.length(); t++)
                    f2[x.charAt(t) - 'a']++;
                if (Arrays.equals(f1, f2))
                    l.add(i);
                i++;
                j++;
            }
            return l;
        }
    }
}
