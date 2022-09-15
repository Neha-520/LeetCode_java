public class _2007FindOrigionalArrayFromDoubledArray {
    class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : changed){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int i = 0;i<changed.length;i++){
           if(changed[i] == 0) {
               int x = hm.get(0);
               if(x % 2 == 0){
                   int y = x/2;
                   while(y > 0){
                       l.add(0);
                       y--;
                   }
               }
               hm.put(0,0);
           }
           if(hm.containsKey(changed[i]*2) && hm.get(changed[i]*2) > 0 && hm.get(changed[i]) > 0){
               l.add(changed[i]);
               hm.put(changed[i],hm.get(changed[i]) - 1);
               hm.put(changed[i] * 2,hm.get(changed[i] * 2) - 1);
           } 
        }
        if(l.size() * 2 != changed.length) return new int[]{};
        int[] arr = l.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
}
