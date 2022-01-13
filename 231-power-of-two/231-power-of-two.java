class Solution {
    boolean ans;
    public boolean isPowerOfTwo(int n) {
        if(n%2==0 && n>=2)
        {
            isPowerOfTwo(n>>1);
        }
        else if(n==1)
            ans=true;
        else ans=false;
        
        return ans;
     }
}