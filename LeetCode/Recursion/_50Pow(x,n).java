public class _50Pow(x {
   class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
         return 1;
        if(n <0)
        return x * myPow(1.0/x,Math.abs(n-1));
        if(n%2 ==0)
        return x * myPow(x ,n-1);
        else
        return x * myPow(x*x,n/2);
    }
} 
}
