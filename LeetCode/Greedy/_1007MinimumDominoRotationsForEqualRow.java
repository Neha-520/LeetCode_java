class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            int max = 0;
            for (int j = 0; j < tops.length; j++) {
                if (tops[j] == i)
                    continue;
                else if (bottoms[j] == i)
                    max++;
                else {
                    max = -1;
                    break;
                }
            }
            if (max != -1)
                ans = Math.min(ans, max);
        }
        for (int i = 1; i <= 6; i++) {
            int max = 0;
            for (int j = 0; j < tops.length; j++) {
                if (bottoms[j] == i)
                    continue;
                else if (tops[j] == i)
                    max++;
                else {
                    max = -1;
                    break;
                }
            }
            if (max != -1)
                ans = Math.min(ans, max);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }

    class Solution2 {
        public int minDominoRotations(int[] tops, int[] bottoms) {
            int[] t = new int[6];
            int[] b = new int[6];
            for (int i = 0; i < tops.length; i++) {
                t[tops[i] - 1]++;
                b[bottoms[i] - 1]++;
            }
            int m1 = 0, c1 = 0;
            for (int i = 0; i < 6; i++) {
                if (t[i] > m1) {
                    m1 = t[i];
                    c1 = i + 1;
                }
            }
            int c2 = 0;
            m1 = 0;
            for (int i = 0; i < 6; i++) {
                if (b[i] > m1) {
                    m1 = b[i];
                    c2 = i + 1;
                }
            }
            while (true) {
                boolean f = true;
                int c = 0;
                if (t[c1 - 1] >= b[c2 - 1]) {
                    for (int i = 0; i < tops.length; i++) {
                        if (tops[i] == c1)
                            continue;
                        else if (bottoms[i] == c1)
                            c++;
                        else {
                            f = false;
                            break;
                        }
                    }
                    if (f)
                        return c;
                } else {
                    boolean f2 = true;
                    c = 0;
                    for (int i = 0; i < bottoms.length; i++) {
                        if (bottoms[i] == c2)
                            continue;
                        else if (tops[i] == c2)
                            c++;
                        else {
                            f2 = false;
                            break;
                        }
                    }
                    if (f2)
                        return c;
                    return -1;
                }
                return -1;
            }
        }
    }
}