public class _682BaseballGame {
    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < ops.length; i++) {
                switch (ops[i]) {
                    case "+":
                        s.push(s.get(s.size() - 1) + s.get(s.size() - 2));
                        break;
                    case "D":
                        s.push(s.peek() * 2);
                        break;
                    case "C":
                        s.pop();
                        break;
                    default:
                        s.push(Integer.valueOf(ops[i]));
                        break;
                }
            }
            int sum = 0;
            for (int i = 0; i < s.size(); i++)
                sum += s.get(i);
            return sum;
        }
    }
}
