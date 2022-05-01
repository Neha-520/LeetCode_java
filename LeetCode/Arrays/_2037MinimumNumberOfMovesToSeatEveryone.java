public class _2037MinimumNumberOfMovesToSeatEveryone {
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);
            int m = 0;
            int i = -1;
            for (int x : students) {
                i++;
                if (x == seats[i])
                    continue;
                else
                    m += Math.abs(x - seats[i]);
            }
            return m;
        }
    }
}
