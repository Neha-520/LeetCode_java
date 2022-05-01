public class _2100FindGoodDaysToRobBank {
    class Solution {
        public List<Integer> goodDaysToRobBank(int[] security, int time) {
            List<Integer> res = new ArrayList<>();
            if (time == 0) {
                for (int i = 0; i < security.length; i++)
                    res.add(i);
                return res;
            }
            int[] pre = new int[security.length];
            int[] post = new int[security.length];
            pre[0] = 0;
            post[security.length - 1] = security.length - 1;
            for (int i = 1; i < security.length; i++) {
                if (security[i] <= security[i - 1])
                    pre[i] = pre[i - 1];
                else
                    pre[i] = i;
            }
            for (int i = security.length - 2; i >= 0; i--) {
                if (security[i] <= security[i + 1])
                    post[i] = post[i + 1];
                else
                    post[i] = i;
            }

            for (int i = time; i < security.length - time; i++) {
                if (pre[i - 1] <= (i - time) && post[i + 1] >= (i + time) && security[i - 1] >= security[i]
                        && security[i + 1] >= security[i])
                    res.add(i);
            }
            return res;
        }
    }
}
