public class _1472DesignBrowserHistory {
    class BrowserHistory {
    ArrayList<String> l;
    int curr;
    public BrowserHistory(String homepage) {
      l = new ArrayList<>();
      l.add(homepage);
      curr = 0;  
    }
    
    public void visit(String url) {
       for(int i = l.size() - 1; i > curr; i--){
            l.remove(i);
       }
       l.add(url);
       curr++; 
    }
    
    public String back(int steps) {
      if((steps - curr) > 0){
          curr = 0;
          return l.get(0);
      }
      while(steps-- > 0){
          curr--;
      } 
      return l.get(curr);  
    }
    
    public String forward(int steps) {
        if((curr + steps) > l.size()-1){
          curr = l.size()-1;
          return l.get(curr);
      }
      while(steps-- > 0){
          curr++;
      }  
      return l.get(curr);   
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
