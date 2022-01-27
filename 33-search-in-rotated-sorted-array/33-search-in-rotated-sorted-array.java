class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
       
        while(left<=right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[0]==target)
                return 0;
            if(target>nums[0]&&target<nums[mid])
            {   
                right=mid-1;
            }
            else if(target<nums[0]&&target<nums[mid])
            {
                if(nums[mid]<nums[0])
                    right=mid-1;
                else left=mid+1;
            }
            else if(target>nums[0]&&target>nums[mid])
            {
                if(nums[mid]<nums[0])
                    right=mid-1;
                else left=mid+1;
            }
            else if(target<nums[0]&&target>nums[mid])
                left=mid+1;
        }    
        return -1;      
       
    }
}