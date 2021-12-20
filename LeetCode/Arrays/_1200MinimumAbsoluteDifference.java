public class _1200MinimumAbsoluteDifference {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> l = new ArrayList<>();
            int d = Integer.MAX_VALUE;
            for (int i = 1; i < arr.length; i++)
                d = Math.min(d, Math.abs(arr[i] - arr[i - 1]));
            System.out.println(d);
            for (int i = 1; i < arr.length; i++) {
                int x = Math.abs(arr[i] - arr[i - 1]);
                List<Integer> l1 = new ArrayList<>();
                if (x == d) {
                    l1.add(arr[i - 1]);
                    l1.add(arr[i]);
                }
                if (l1.size() != 0)
                    l.add(l1);
            }
            return l;
        }
    }
}
