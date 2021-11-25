public class _1337TheKWeakestRowsinMatrix {
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int a[] = new int[k];
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < mat.length; i++) {
                int sum = 0;
                for (int j = 0; j < mat[i].length; j++) {
                    sum += mat[i][j];
                }
                hm.put(i, sum);
            }
            List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
            Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
            for (int i = 0; i < a.length && i < k; i++) {
                a[i] = list.get(i).getKey();
            }
            return a;
        }
    }
}
