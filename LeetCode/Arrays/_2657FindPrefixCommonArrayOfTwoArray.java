class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n];
        int ans = 0;
    for(int i = 0;i<n;i++){
         a[A[i]]++; 
         b[B[i]]++; 
         if(A[i] == B[i]) ans++;
         else{
           if(a[A[i]] > 0 && b[A[i]] > 0) ans++;
           if(a[B[i]] > 0 && b[B[i]] > 0) ans++;
         }
          c[i] = ans;
       }
      return c;
    }
}

//2nd solution

class Solution2 {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] stat = new int[a.length + 1];
        int[] c = new int[a.length];

        int cur = 0;
        for (int i = 0; i < a.length; i++) {
            stat[a[i]]++;
            if (stat[a[i]] == 2) {
                cur++;
            }
            stat[b[i]]++;
            if (stat[b[i]] == 2) {
                cur++;
            }
            c[i] = cur;
        }
        return c;
    }
}