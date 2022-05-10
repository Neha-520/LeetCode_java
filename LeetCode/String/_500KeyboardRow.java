public class _500KeyboardRow {
    class Solution {
        public String[] findWords(String[] words) {
            ArrayList<String> res = new ArrayList<>();
            for (String w : words) {
                String x = w.toLowerCase();
                boolean f1 = true, f2 = true, f3 = true;
                String s1 = "qwertyuiop", s2 = "asdfghjkl", s3 = "zxcvbnm";
                for (char c : x.toCharArray()) {
                    if (!s1.contains(String.valueOf(c)))
                        f1 = false;
                    if (!s2.contains(String.valueOf(c)))
                        f2 = false;
                    if (!s3.contains(String.valueOf(c)))
                        f3 = false;
                    if (f1 == false && f2 == false && f3 == false)
                        break;
                }
                if (f1 == true || f2 == true || f3 == true)
                    res.add(w);
            }
            return res.toArray(new String[res.size()]);
        }
    }
}
