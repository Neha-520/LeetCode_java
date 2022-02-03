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

    class Solution2 {
        public List<Integer> findAnagrams(String s, String p) {
            int freq1[] = new int[26];
            int freq2[] = new int[26];
            List<Integer> list = new ArrayList<>();

            if (s.length() < p.length())
                return list;

            for (int i = 0; i < p.length(); i++) {
                freq1[s.charAt(i) - 'a']++;
                freq2[p.charAt(i) - 'a']++;
            }

            int start = 0;
            int end = p.length();

            if (Arrays.equals(freq1, freq2))
                list.add(start);

            while (end < s.length()) {
                freq1[s.charAt(start) - 'a']--;
                freq1[s.charAt(end) - 'a']++;
                if (Arrays.equals(freq1, freq2))
                    list.add(start + 1);

                start++;
                end++;
            }
            return list;
        }
    }
}