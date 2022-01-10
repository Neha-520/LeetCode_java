public class _2129CapitalizeTheTitle {
    class Solution {
        public String capitalizeTitle(String title) {
            String[] c = title.split(" ");
            int i = 0;
            for (String w : c) {
                StringBuilder sb = new StringBuilder();
                if (w.length() > 2) {
                    sb.append(w.substring(0, 1).toUpperCase());
                    sb.append(w.substring(1).toLowerCase());
                } else
                    sb.append(w.toLowerCase());
                c[i++] = sb.toString();
            }
            return String.join(" ", c);
        }
    }
}
