class NumberContainers {
    Map<Integer, Integer> indexMap;
    Map<Integer,PriorityQueue<Integer>> numberMap;
    public NumberContainers() {
         indexMap = new HashMap<>();
         numberMap = new HashMap<>();        
    }
    
    public void change(int index, int number) {
        if(indexMap.containsKey(index)){
              int num = indexMap.get(index); 
              if(num != number){
                PriorityQueue<Integer> temp2 = numberMap.get(num);
                temp2.remove(index);
                if(temp2.isEmpty()) numberMap.remove(num);              
              } else return;
        }
        numberMap.putIfAbsent(number, new PriorityQueue<>());
        numberMap.get(number).add(index);
        indexMap.put(index,number);
    }
    
    public int find(int number) {
        if(numberMap.containsKey(number)){
          return numberMap.get(number).peek();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */