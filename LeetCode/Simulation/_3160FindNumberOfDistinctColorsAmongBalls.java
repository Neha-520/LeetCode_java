class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> bm = new HashMap<>();
        int coloured = 0;
        int[] res = new int[queries.length];
        int i = 0;
        for(int[] q : queries){
            int ball = q[0];
            int colour = q[1];   
           if(bm.containsKey(ball)){
              int oldcolour = bm.get(ball);
              int count = hm.get(oldcolour);
              if(count == 1) hm.remove(oldcolour);
              else hm.put(oldcolour,count-1);
           }
            hm.put(colour,hm.containsKey(colour) ? hm.get(colour)+1: 1);
            bm.put(ball,colour);    
            coloured = hm.size();
            res[i++] = coloured;
        }
        return res;
    }
}