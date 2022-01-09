public class _2114MaximumNumberOfWordsFoundInSentences {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int max = -1;
            for (String i : sentences)
                max = Math.max(max, i.split(" ").length);
            return max;
        }
    }

}
