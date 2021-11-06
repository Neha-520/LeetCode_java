public class _1796SecondLargestDigitinString {
    class Solution {
        public int secondHighest(String s) {
            SortedSet<Character> set = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)))
                    set.add(s.charAt(i));
            }
            if (set.size() > 1) {
                set.remove(set.last());
                return set.last() - '0';
            } else {
                return -1;
            }
        }
    }

    class Solution2 {
        public int secondHighest(String s) {
            SortedSet<Character> ts = new TreeSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) && s.charAt(i) != 0)
                    ts.add(s.charAt(i));
            }
            if (ts.size() < 2)
                return -1;
            Iterator<Character> it = ts.iterator();

            Character current = new Character(' ');
            int x = ts.size() - 1;
            while (it.hasNext() && x > 0) {
                current = it.next();
                x--;
            }
            return Character.getNumericValue(current);
        }
    }
}
