public class _6ZigzagConversion {
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1)
                return s;
            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < Math.min(numRows, s.length()); i++)
                rows.add(new StringBuilder());
            int index = 0;
            while (index < s.length()) {
                for (int i = 0; i < numRows && index < s.length(); i++)
                    rows.get(i).append(s.charAt(index++));
                for (int i = numRows - 2; i > 0 && index < s.length(); i--)
                    rows.get(i).append(s.charAt(index++));
            }
            StringBuilder ret = new StringBuilder();
            for (StringBuilder row : rows)
                ret.append(row);
            return ret.toString();
        }
    }
}
