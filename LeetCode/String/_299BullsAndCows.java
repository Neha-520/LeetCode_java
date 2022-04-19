public class _299BullsAndCows {
    class Solution {
        public String getHint(String secret, String guess) {
            int bull = 0, cow = 0;
            int[] c2 = new int[10];
            for (char c : guess.toCharArray()) {
                c2[c - '0']++;
            }
            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) == guess.charAt(i)) {
                    bull++;
                    c2[guess.charAt(i) - '0']--;
                }
            }
            for (int i = 0; i < secret.length(); i++) {
                if (secret.charAt(i) != guess.charAt(i)) {
                    if (c2[secret.charAt(i) - '0'] > 0) {
                        cow++;
                        c2[secret.charAt(i) - '0']--;
                    }
                }
            }
            return bull + "A" + cow + "B";
        }
    }
}
