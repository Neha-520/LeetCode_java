package String;

public class _1374GenerateaStringWithCharactersThatHaveOddCounts {
    class Solution {
        public String generateTheString(int n) {
            String x = "a".repeat(n - 1);
            if (n % 2 == 0)
                return x + "b";
            return x + "a";
        }
    }
}
