public class _1291SequentialDigits {
    class Solution {
        public List<Integer> sequentialDigits(int low, int high) {
            List<Integer> results = new ArrayList<Integer>();
            for (int i = 1; i <= 9; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);

                for (int j = i + 1; j <= 9; j++) {
                    sb.append(j);
                    int potential = Integer.valueOf(sb.toString());

                    if (potential >= low && potential <= high)
                        results.add(potential);
                    if (potential > high)
                        break;
                }
            }
            Collections.sort(results);
            return results;
        }
    }
}
