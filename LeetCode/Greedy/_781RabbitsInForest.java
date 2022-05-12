public class _781RabbitsInForest {
    class Solution {
    public int numRabbits(int[] answers) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int ans = 0; 
       for(int n : answers){
         hm.put(n,hm.getOrDefault(n,0)+1);
       }
       for(Integer x : hm.keySet()){
          if(hm.get(x) < x) ans += x + 1;
          else if(hm.get(x) % (x + 1) == 0) ans += hm.get(x);
          else ans += ((hm.get(x)/(x + 1)) * (x+1)) + x + 1; 
       } 
        return ans;
    }
}
}
