public class _394DecodeString {
    class Solution {
        public String decodeString(String s) {
            Stack<Integer> timeSt = new Stack<>();
            Stack<StringBuilder> builderSt = new Stack<>();
            int times = 0;
            builderSt.push(new StringBuilder());
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '[') {
                    builderSt.push(new StringBuilder());
                    timeSt.push(times);
                    times = 0;
                } else if (ch == ']') {
                    String str = builderSt.pop().toString();
                    int time = timeSt.pop();
                    StringBuilder sb = builderSt.peek();
                    for (int j = 0; j < time; j++)
                        sb.append(str);
                } else if (ch - '0' >= 0 && ch - '0' <= 9) {
                    times = times * 10 + (ch - '0');
                } else {
                    builderSt.peek().append(ch);
                }
            }
            return builderSt.pop().toString();
        }
    }
}
