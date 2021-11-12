public class _657RobotReturningToOrigin {
    class Solution {
        public boolean judgeCircle(String moves) {
            int u = 0;
            int l = 0;

            char[] arr = moves.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'U') {
                    u++;
                } else if (arr[i] == 'D') {
                    u--;
                } else if (arr[i] == 'L') {
                    l++;
                } else {
                    l--;
                }
            }

            if (u == 0 && l == 0) {
                return true;
            } else {
                return false;
            }

        }
    }
}
