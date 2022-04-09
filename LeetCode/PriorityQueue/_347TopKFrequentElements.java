class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] a = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>((c,d)->hm.get(c)-hm.get(d));
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            p.add(e.getKey());
            if(p.size() > k) p.poll();
        }
        int i = 0;
        for(Integer n : p){
            a[i++] = n;
        }
        return a;
    }
}