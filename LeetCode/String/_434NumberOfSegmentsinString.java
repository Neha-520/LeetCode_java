public class _434NumberOfSegmentsinString {
    class Solution {
        public int countSegments(String s) {
            if (s == null || s.trim().equals(""))
                return 0;
            return s.trim().split("\\s+").length;
        }
    }
}
