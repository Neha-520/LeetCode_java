public class _739DailyTemperatures {
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int hottest = 0;
            int answer[] = new int[n];
            for (int currDay = n - 1; currDay >= 0; currDay--) {
                int currentTemp = temperatures[currDay];
                if (currentTemp >= hottest) {
                    hottest = currentTemp;
                    continue;
                }
                int days = 1;
                while (temperatures[currDay + days] <= currentTemp) {
                    // Use information from answer to search for the next warmer day
                    days += answer[currDay + days];
                }
                answer[currDay] = days;
            }
            return answer;
        }
    }

    // ----------2nd Soln---------------
    public int[] dailyTemperatures2(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            // Popping all indices with a lower or equal temperature than the current index
            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            // If the stack still has elements, then the next warmer temperature exists!
            if (!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }
            // Inserting current index in the stack: monotonicity is maintained!
            st.push(i);
        }
        return ans;
    }
}
