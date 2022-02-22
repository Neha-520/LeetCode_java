public class _171ExcelSheetColumnNumber {
    class Solution {
        public int titleToNumber(String columnTitle) {
            if (columnTitle.length() == 1)
                return ((columnTitle.charAt(0) - 'A') + 1);
            int sum = 0, x = 0;
            for (int i = columnTitle.length() - 1; i >= 0; i--) {
                int d = (columnTitle.charAt(i) - 'A') + 1;
                sum += Math.pow(26, x++) * d;
            }
            return sum;
        }
    }
}
