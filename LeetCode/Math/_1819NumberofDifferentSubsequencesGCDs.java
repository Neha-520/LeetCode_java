public class _1819NumberofDifferentSubsequencesGCDs {
    class Solution {
        public int countDifferentSubsequenceGCDs(int[] nums) {
            // https://youtu.be/ZYJDCcKnwag
            int max = 0;
            // the max value will be the max gcd possible
            boolean present[] = new boolean[200001];
            for (int num : nums) {
                max = Math.max(max, num);
                present[num] = true;
            }
            int count = 0;
            for (int i = 1; i <= max; i++) {
                // if the number is present in our arr
                // then for sure it behaves as gcd of it's own
                if (present[i]) {
                    count++;
                    continue;
                }
                // but if this number is not present in the array
                // then we need to check if there is a a sub-sequence
                // where this i can exist as a gcd
                // for a value i -> gcd will either be greater(multiple of i=4 i.e gcd(8,16) ->
                // 8)
                // or equal to i
                // as soon as we get a sequence where it's i we can say
                // that gcd of i is possible i.e (in 8,16,20) and i=4 for 8,16 it's 8 but for
                // 8,16,20
                // it will become 4 and will remain 4 only for any upcoming multiples
                // so we can break from here increasing our count by 1
                int temp_gcd = 0;
                for (int j = i; j <= max; j += i) {

                    if (present[j]) {
                        // if this multiple is present we will take the gcd
                        temp_gcd = gcd(temp_gcd, j);
                    }
                    // check if it's i we can say a subsequene exists which have
                    // gcd as i
                    if (temp_gcd == i) {
                        count++;
                        break;
                    }
                }
            }
            return count;
        }

        public int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }
}
