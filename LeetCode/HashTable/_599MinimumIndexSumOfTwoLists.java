public class _599MinimumIndexSumOfTwoLists {
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            HashMap<String, Integer> hm = new HashMap<>();
            for (int i = 0; i < list1.length; i++) {
                hm.put(list1[i], i);
            }
            ArrayList<String> l = new ArrayList<>();
            for (int i = 0; i < list2.length; i++) {
                if (!hm.containsKey(list2[i]))
                    continue;
                else {
                    hm.put(list2[i], hm.get(list2[i]) + i);
                    l.add(list2[i]);
                }
            }
            if (l.size() == 1) {
                String[] myArray = new String[l.size()];
                l.toArray(myArray);
                return myArray;
            }
            int min = Integer.MAX_VALUE;
            for (String s : l) {
                int x = hm.get(s);
                min = Math.min(min, x);
            }
            ArrayList<String> l2 = new ArrayList<>();
            for (String s : l) {
                if (hm.get(s) == min)
                    l2.add(s);
            }
            String[] myArray = new String[l2.size()];
            l2.toArray(myArray);
            return myArray;
        }
    }
}
