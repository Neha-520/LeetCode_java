class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int prefixSum = 0;
        int ans = 0;
        hm.put(0,1);
        for(int i = 0;i<nums.length;i++){
            prefixSum = (prefixSum + nums[i])%k;
            if(prefixSum<0) prefixSum +=k;
            if(hm.containsKey(prefixSum)){              
                ans = ans+hm.get(prefixSum);            
                hm.put(prefixSum,hm.get(prefixSum)+1);
            }else hm.put(prefixSum,1);
        }
        return ans; 
    }
}