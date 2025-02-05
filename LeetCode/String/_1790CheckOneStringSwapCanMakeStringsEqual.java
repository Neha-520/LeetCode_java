class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
      char existing = 0,replace = 0; 
      int count = 0;
      boolean f = true;
      for(int i = 0;i<s1.length();i++){
         char a = s1.charAt(i);
         char b = s2.charAt(i);     
        if(a != b){          
            if(count == 0){
                existing = a;
                replace = b;
            }else if(count == 1 && (a != replace || b != existing)){
               return false;
            }
            count++;
         }       
        if(count > 2) return false;
      }
      if(count == 1) f = false;
      return f;
    }
}