class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            
            if(nums[mid]>target)
            {
                right=mid-1;
            }
            else left=mid+1;
        }
        
        return left;
    }
}