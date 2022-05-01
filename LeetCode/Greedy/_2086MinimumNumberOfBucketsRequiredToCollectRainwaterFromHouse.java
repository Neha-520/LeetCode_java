public class _2086MinimumNumberOfBucketsRequiredToCollectRainwaterFromHouse {
    class Solution {
        public int minimumBuckets(String street) {
            if (street.contains("HHH"))
                return -1;
            boolean[] collected = new boolean[street.length()];
            int ans = 0, id = 0;
            while (true) {
                int x = street.indexOf("H.H", id);
                if (x == -1)
                    break;
                collected[x] = true;
                collected[x + 2] = true;
                ans++;
                id = x + 3;
                if (id >= street.length())
                    break;
            }
            for (int i = 0; i < street.length(); i++) {
                if (collected[i] == true)
                    continue;
                if (street.charAt(i) == 'H') {
                    if ((i >= 1 && street.charAt(i - 1) == '.') ||
                            (i + 1 < street.length() && street.charAt(i + 1) == '.'))
                        ans++;
                    else
                        return -1;
                }
            }
            return ans;
        }
    }
}
