class Solution {
    public boolean isPalindrome(int x) {
        int result=0, q=x,rem;
        while(q!=0)
        {
            rem=q%10;
            result= result*10+rem;
            q=q/10;
        }
        if(result<0)
           result= result*(-1);
        if(result==x)
            return true;
        else return false;
    }
}