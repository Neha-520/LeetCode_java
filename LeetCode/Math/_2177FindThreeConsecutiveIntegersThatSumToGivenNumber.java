class _2177FindThreeConsecutiveIntegersThatSumToGivenNumber {
    class Solution {
        public long[] sumOfThree(long num) {
            long l[] = new long[3];
            l[0] = num / 3 - 1;
            l[1] = num / 3;
            l[2] = num / 3 + 1;
            if (l[0] + l[1] + l[2] != num)
                return new long[] {};
            return l;
        }
    }
}