package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _1629SlowestKey {
    class Solution {
        public char slowestKey(int[] releaseTimes, String keysPressed) {
            int[] b = new int[releaseTimes.length];
            b[0] = releaseTimes[0];
            for (int i = 1; i < releaseTimes.length; i++) {
                b[i] = releaseTimes[i] - releaseTimes[i - 1];
            }
            int max = 0;
            for (int i = 0; i < b.length; i++) {
                max = Math.max(max, b[i]);
            }
            ArrayList<Character> a = new ArrayList<>();
            for (int i = 0; i < b.length; i++) {
                if (max == b[i])
                    a.add(keysPressed.charAt(i));
            }
            if (a.size() == 1) {
                return a.get(0);
            }
            char[] m = new char[a.size()];
            for (int i = 0; i < m.length; i++) {
                m[i] = a.get(i);
            }
            Arrays.sort(m);
            return m[m.length - 1];
        }
    }

}
