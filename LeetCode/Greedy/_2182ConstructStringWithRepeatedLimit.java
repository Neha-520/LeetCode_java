public class _2182ConstructStringWithRepeatedLimit {
    class Solution {
        int mp[] = new int[26];
        int max;
        int secondMax;

        public String repeatLimitedString(String s, int repeatLimit) {
            for (int i = 0; i < s.length(); i++) {
                mp[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            find();
            while (max != -1) {
                if (mp[max] <= repeatLimit) {
                    for (int i = mp[max]; i > 0; i--) {
                        sb.append((char) (max + 'a'));
                    }
                    mp[max] = 0;
                } else {
                    for (int i = repeatLimit; i > 0; i--) {
                        sb.append((char) (max + 'a'));
                    }
                    mp[max] -= repeatLimit;
                    if (secondMax != -1) {
                        sb.append((char) (secondMax + 'a'));
                        mp[secondMax]--;
                    } else {
                        break;
                    }
                }
                find();
            }
            return sb.toString();
        }

        private void find() {
            for (int i = 25; i >= 0; i--) {
                if (mp[i] != 0) {
                    max = i;
                    break;
                }
                max = -1;
            }
            if (max == 0 || max == -1)
                secondMax = -1;
            else {
                for (int i = max - 1; i >= 0; i--) {
                    if (mp[i] != 0) {
                        secondMax = i;
                        break;
                    }
                    secondMax = -1;
                }
            }
        }
    }
}
