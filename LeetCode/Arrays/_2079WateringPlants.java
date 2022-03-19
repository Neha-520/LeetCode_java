public class _2079WateringPlants {
    class Solution {
        public int wateringPlants(int[] plants, int capacity) {
            int step = 0, x = capacity;
            for (int i = 0; i < plants.length; i++) {
                if (plants[i] <= capacity) {
                    x -= plants[i];
                    step++;
                }
                if (i != plants.length - 1 && plants[i + 1] > x) {
                    step += 2 * (i + 1);
                    x = capacity;
                }
            }
            return step;
        }
    }
}
