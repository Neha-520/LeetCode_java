class Solution {
    class FC{
       int c;
       char k; 
        FC(char y,int x){
          k = y;
          c = x;  
        }
    }
    public String removeDuplicates(String s, int m) {
        if(s.length()<m) return s;
        Stack<FC> st = new Stack<>();
        int i = 0;        
        while(i < s.length()){
            char ch = s.charAt(i);
            if (!st.isEmpty() && ch == st.peek().k){
                if(st.peek().c == m - 1) st.pop();
                else st.peek().c++;
            }
            else st.push(new FC(ch,1));
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            int c = st.peek().c;
            while(c-- > 0 && !st.isEmpty()) sb.append(st.peek().k);
            st.pop();
        }
        return sb.reverse().toString();
    }
}

