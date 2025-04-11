class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for(int i = low;i <= high; i++){
            String s = String.valueOf(i);
            if(s.length() % 2 != 0) continue;
            int l = s.length();
            String s1 = s.substring(0,l/2);
            String s2 = s.substring(l/2);
            if(sumString(s1) == sumString(s2)) res++;
        }
        return res;
    }

    public int sumString(String s){
        int sum = 0;
        for(char c: s.toCharArray()){
            sum += c - '0';
        }
        return sum;
    }
}