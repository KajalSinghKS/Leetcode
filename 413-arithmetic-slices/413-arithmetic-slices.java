class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length == 1 || nums.length == 2)
            return 0;
        
        int diff=2001,count=0,ans=0,sub=0;
        
        for(int i=1;i<nums.length;i++)
        {   
            if(nums[i]-nums[i-1]!=diff)
            {
                diff = nums[i]-nums[i-1];
                ans+=count;
                count = 0;
                sub=i-1;
            }
            else
            {   
                count += i-sub-1;
                System.out.println(count);
            }
        }
        
        ans+=count;
        
        return ans;
    }
}