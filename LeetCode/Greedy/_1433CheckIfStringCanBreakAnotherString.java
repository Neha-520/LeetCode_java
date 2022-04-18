public class _1433CheckIfStringCanBreakAnotherString {
    class Solution {
        public boolean checkIfCanBreak(String s1, String s2) {
            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            int lesser = 0;
            int greater = 0;
            for (int i = 0; i < s1Array.length; i++) {
                if (s1Array[i] < s2Array[i])
                    lesser++;
                else if (s1Array[i] > s2Array[i])
                    greater++;
                if (lesser > 0 && greater > 0)
                    return false;
            }
            return true;
        }
    }
}
