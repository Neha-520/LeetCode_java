class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = -1,sum = 0,temp = 0;
        for(int n : nums){
            sum = String.valueOf(n).chars()
                            .map(c -> c - '0')  // Convert each character to its numeric value
                            .sum();
            if(hm.containsKey(sum)){
                temp = hm.get(sum);
                max = Math.max(max,n + temp); 
                hm.put(sum,Math.max(n,temp));    
            }   
            else hm.put(sum,n);                   
        }
        return max;
    }
}