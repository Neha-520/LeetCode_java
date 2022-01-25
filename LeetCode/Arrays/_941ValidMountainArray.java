public class _941ValidMountainArray {
    class Solution {
        public boolean validMountainArray(int[] arr) {
            if (arr.length < 3)
                return false;
            int max = -1, index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }
            if (index == 0 || index == arr.length - 1)
                return false;
            int j = index;
            for (int i = index - 1; i >= 0; i--) {
                if ((arr[i] >= arr[j]) || (arr[i] >= arr[index]))
                    return false;
                j--;
            }
            j = index;
            for (int i = index + 1; i < arr.length; i++) {
                if ((arr[i] >= arr[j]) || (arr[i] >= arr[index]))
                    return false;
                j++;
            }
            return true;
        }
    }
}
