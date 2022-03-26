public class _179LargestNumber {
    class Solution {
        public class comp implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                int x = Integer.valueOf(a.charAt(0));
                int y = Integer.valueOf(b.charAt(0));
                if (x > y)
                    return -1;
                else if (x < y)
                    return 1;
                else {
                    if (((a + b).compareTo((b + a)) < 0))
                        return 1;
                    else
                        return -1;
                }
            }
        }

        public String largestNumber(int[] nums) {
            String[] s = new String[nums.length];
            int j = 0;
            for (int i : nums)
                s[j++] = String.valueOf(i);
            Arrays.sort(s, new comp());
            if (s[0].equals("0"))
                return "0";
            StringBuilder sb = new StringBuilder();
            for (String x : s) {
                sb.append(x);
            }
            return sb.toString();
        }
    }

    class Solution {
        public class comp implements Comparator<String> {
            @Override
            public int compare(String a, String b) {
                return ((b + a)).compareTo((a + b));
            }
        }

        public String largestNumber(int[] nums) {
            String[] s = new String[nums.length];
            int j = 0;
            for (int i : nums)
                s[j++] = String.valueOf(i);
            Arrays.sort(s, new comp());
            if (s[0].equals("0"))
                return "0";
            StringBuilder sb = new StringBuilder();
            for (String x : s) {
                sb.append(x);
            }
            return sb.toString();
        }
    }
}
