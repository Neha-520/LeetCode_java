public class _75SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int red = 0;
            int blue = nums.length - 1;
            for (int i = 0; i <= blue; i++) {
                if (nums[i] == 0) {
                    swap(nums, i, red);
                    red++;
                } else if (nums[i] == 2) {
                    swap(nums, i, blue);
                    i--;
                    blue--;
                }
            }
        }

        private void swap(int[] nums, int left, int right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
    }

    class Solution2 {
        public void sortColors(int[] nums) {
            int l = 0, mid = 0, h = nums.length - 1;
            while (mid <= h) {
                switch (nums[mid]) {
                    case 0:
                        swap(nums, l, mid);
                        l++;
                        mid++;
                        break;
                    case 1:
                        mid++;
                        break;
                    case 2:
                        swap(nums, mid, h);
                        h--;
                        break;
                }
            }
        }

        void swap(int a[], int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

}
