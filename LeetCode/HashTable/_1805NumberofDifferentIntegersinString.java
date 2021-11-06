public class _1805NumberofDifferentIntegersinString {
    class Solution {
        public int numDifferentIntegers(String word) {
            String replaced = word.replaceAll("[a-z]", " "); // replace all a-z characters
            Set<String> nums = new HashSet();
            String[] words = replaced.split(" "); // split based on space character
            for (String s : words) {
                if (s.trim().length() > 0) // if word is not empty add to the set
                    nums.add(s.replaceAll("^0*", "")); // replace all leading zeros - ^matchs the beginning zeros * as
                                                       // many as zeros will be matched
            }
            return nums.size();
        }
    }
}
