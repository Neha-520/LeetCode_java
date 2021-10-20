public class _929UniqueEmailAddresses {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            if (emails.length == 0 || emails.length == 1)
                return emails.length;
            HashSet<String> hm = new HashSet<>();
            for (int i = 0; i < emails.length; i++) {
                StringBuilder sb = new StringBuilder(emails[i]);
                if (emails[i].contains("+")) {
                    String substr = sb.substring(0, sb.indexOf("+"));
                    substr = substr.replace(".", "");
                    sb.replace(0, sb.indexOf("@"), substr);
                } else {
                    String substr = sb.substring(0, sb.indexOf("@"));
                    substr = substr.replace(".", "");
                    sb.replace(0, sb.indexOf("@"), substr);
                }
                hm.add(sb.toString());
            }
            return hm.size();
        }
    }
}
