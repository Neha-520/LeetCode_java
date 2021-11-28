public class _1945SumofDigitsofStringAfterConvert {
    class Solution {
        public int getLucky(String s, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
                sb.append(s.charAt(i) - 'a' + 1);

            int temp = 0;
            while (k-- > 0) {
                int sum = 0;

                for (int i = 0; i < sb.length(); i++)
                    sum += Integer.parseInt(String.valueOf(sb.charAt(i)));

                sb = new StringBuilder(String.valueOf(sum));
                temp = sum;
            }
            return temp;
        }
    }
}
