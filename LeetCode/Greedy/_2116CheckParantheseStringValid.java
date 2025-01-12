class Solution {
    public boolean canBeValid(String s, String locked) {
 int n = s.length();
        
        // If the length of the string is odd, it can't be a valid parentheses string
        if (n % 2 != 0) {
            return false;
        }
        
        // Left-to-right pass: ensure we don't have more closing than opening parentheses
        int balance = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else {
                // If locked, decrement the balance, else we can choose to treat it as either '(' or ')'
                if (locked.charAt(i) == '1') {
                    balance--;
                } else {
                    balance++;
                }
            }
            
            // If at any point balance goes negative, we can't have more ')' than '('
            if (balance < 0) {
                return false;
            }
        }
        
        // Right-to-left pass: ensure we don't have more opening than closing parentheses
        balance = 0;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                balance++;
            } else {
                if (locked.charAt(i) == '1') {
                    balance--;
                } else {
                    balance++;
                }
            }
            
            // If at any point balance goes negative, we can't have more '(' than ')'
            if (balance < 0) {
                return false;
            }
        }
        
        // If we reach here, the string can be transformed into a valid parentheses string
        return true;
    }
}