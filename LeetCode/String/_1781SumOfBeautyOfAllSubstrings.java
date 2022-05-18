class Solution {
public int beautySum(String s) {   
    int res = 0;
    int c[] = new int[26];    
    for(int i = 0; i < s.length(); i++){
        c[s.charAt(i) - 'a']++;
        for(int j = i + 1; j < s.length(); j++){
            res += helper(s, i, j, c);
        }
        Arrays.fill(c,0);   
    }
    return res;
}
  public int helper(String s,int i, int j, int[] c){
    c[s.charAt(j) - 'a']++;    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int count = 0;   
    for(int n : c){
        if(n != 0){
            max = Math.max(max, n);
            min = Math.min(min, n);
            count++;
        }
    }
    if(count > 1) return Math.abs(min - max);
    return 0;
  }
}