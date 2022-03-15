public class _17LetterCombinationOfPhoneNumber {
    class Solution {
        String[] chars = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        public List<String> letterCombinations(String digits) {
            // HashMap<Character,ArrayList<Character>> hm = new HashMap<>();
            // Character ch = 'a';
            // int j = 0;
            // for(char i = '2';i<='9';i++){
            // ArrayList<Character> x = new ArrayList<>();
            // if(i != '7' && i != '9') j = 3;
            // else j = 4;
            // while(j-- > 0){
            // x.add(ch++);
            // }
            // hm.put(i,x);
            // }
            List<String> result = new ArrayList<String>();
            if (digits == null || digits.length() == 0)
                return result;
            helper(result, new StringBuilder(), digits, 0);
            return result;
        }

        public void helper(List<String> result, StringBuilder sb, String digits, int index) {
            if (index == digits.length()) {
                result.add(sb.toString());
                return;
            }
            String str = chars[digits.charAt(index) - '0'];
            for (char c : str.toCharArray()) {
                sb.append(c);
                helper(result, sb, digits, index + 1);
                sb.setLength(sb.length() - 1);
            }
        }
    }
}
