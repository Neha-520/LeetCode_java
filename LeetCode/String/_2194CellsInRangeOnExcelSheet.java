public class _2194CellsInRangeOnExcelSheet {
    class Solution {
        public List<String> cellsInRange(String s) {
            List<String> l = new ArrayList<>();
            char a = s.charAt(0);
            char b = s.charAt(1);
            char c = s.charAt(3);
            char d = s.charAt(4);
            for (char ch = a; ch <= c; ch++) {
                for (char ch2 = b; ch2 <= d; ch2++) {
                    l.add(String.valueOf(ch) + String.valueOf(ch2));
                }
            }
            return l;
        }
    }
}
