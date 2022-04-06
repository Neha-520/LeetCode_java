class Solution {
    public int threeSumMulti(int[] arr, int target) {
     Arrays.sort(arr);
     int MOD = 1_000_000_007;  
     long sum = 0;
     for(int i = 0;i<arr.length;i++){
         int t = target - arr[i];
         int j = i+1,k = arr.length-1;
         while(j <= k){
            if(arr[j] + arr[k] < t) j += 1;
            else if(arr[j] + arr[k] > t) k-=1;
            else if(arr[j] != arr[k]){
                int left = 1, right = 1;
                    while (j+1 < k && arr[j] == arr[j+1]) {
                        left++;
                        j++;
                    }
                    while (k-1 > j && arr[k] == arr[k-1]) {
                        right++;
                        k--;
                    }
                    sum += left * right;
                    sum %= MOD;
                    j++;
                    k--;
            }
            else{
               sum += (k-j+1) * (k-j) / 2;
               sum %= MOD;
               break;
            }
         }
     }
        return (int)sum;
    }
}