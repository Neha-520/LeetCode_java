class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length;) {
            char x = chars[i];
            int j = 0;
            while (i < chars.length && chars[i] == x) {
                j++;
                i++;
            }
            sb.append(x);
            if (j != 1) {
                if (j >= 10) {
                    String r = String.valueOf(j);
                    sb.append(r);
                } else {
                    char b = (char) (j + '0');
                    sb.append(b);
                }
            }
        }
        String s = sb.toString();
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}