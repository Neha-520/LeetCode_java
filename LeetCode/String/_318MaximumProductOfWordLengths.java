class Solution {
    public int maxProduct(String[] words) {
      int ans = 0;  
      for(int i = 0;i < words.length - 1;i++){
        for(int j = i + 1;j<words.length;j++){
           if(words[i].length() * words[j].length() > ans){
              if(helper(words[i],words[j]))
                ans = Math.max(ans,words[i].length() * words[j].length());
           }
        }  
      }  
        return ans;
    }
    public boolean helper(String x,String y){
        for(char c : x.toCharArray()){
            if(y.indexOf(c) >= 0) return false;
        }
        return true;
    }
}