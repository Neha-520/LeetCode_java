public class _374GuessNumberHigherorLower {
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int l = 1, r = n, mid = 0;
            while (l <= r) {
                mid = l + (r - l) / 2;
                if (guess(mid) == 0)
                    return mid;
                else if (guess(mid) < 0)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            return mid;
        }
    }
}
