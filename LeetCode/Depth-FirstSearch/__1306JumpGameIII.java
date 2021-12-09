public class __1306JumpGameIII {
    class Solution {

        public boolean canReach(int[] arr, int s) {

            if (s > arr.length - 1 || s < 0 || arr[s] < 0)
                return false;

            if (arr[s] == 0)
                return true;
            arr[s] = -arr[s];
            return (canReach(arr, s + arr[s]) || canReach(arr, s - arr[s]));

        }
    }

    /////////////////////////////////
    // using bfs
    class Solution2 {
        public boolean canReach(int[] arr, int start) {
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while (!q.isEmpty()) {
                int x = q.poll();

                if (arr[x] == 0)
                    return true;
                if (arr[x] < 0)
                    continue;
                if (x + arr[x] < arr.length)
                    q.add(x + arr[x]);
                if (x - arr[x] >= 0)
                    q.add(x - arr[x]);

                arr[x] = -arr[x];
            }
            return false;
        }
    }
}
