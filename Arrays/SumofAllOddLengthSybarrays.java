package Arrays;

public class SumofAllOddLengthSybarrays {
    class Solution {
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0, n = arr.length;
            for (int i = 0; i < n; i++) {
                int start = n - i;
                int end = i + 1;
                int total = (start * end);
                int odd = total / 2;
                if (total % 2 != 0)
                    odd++;
                sum += odd * arr[i];
            }
            return sum;
        }
    }
}
