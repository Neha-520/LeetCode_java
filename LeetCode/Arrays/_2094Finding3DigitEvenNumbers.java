public class _2094Finding3DigitEvenNumbers {
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            int[] count = new int[10];
            for (int digit : digits) {
                count[digit]++;
            }

            List<Integer> list = new ArrayList<>();
            // 3 digits even number is between [100, 998]
            for (int i = 100; i < 999; i += 2) {
                if (valid(i, count))
                    list.add(i);
            }

            int n = list.size();
            int[] result = new int[n];
            for (int i = 0; i < n; i++)
                result[i] = list.get(i);

            return result;
        }

        private boolean valid(int number, int[] count) {
            // count digit of one number
            int[] c = new int[10];
            while (number != 0) {
                c[number % 10]++;
                number /= 10;
            }
            // check number's digit count is enough
            for (int i = 0; i < 10; i++) {
                if (c[i] > count[i])
                    return false;
            }
            return true;
        }
    }

    //////////////////////////////////////////
    // brute force
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            int N = digits.length;
            TreeSet<Integer> uniq = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                if (digits[i] == 0)
                    continue;
                for (int j = 0; j < N; j++) {
                    if (i == j)
                        continue;
                    for (int k = 0; k < N; k++) {
                        if (i == k || j == k || digits[k] % 2 != 0)
                            continue;
                        uniq.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                    }
                }
            }
            int[] ret = new int[uniq.size()];
            int id = 0;
            for (int i : uniq)
                ret[id++] = i;
            return ret;
        }
    }
}
