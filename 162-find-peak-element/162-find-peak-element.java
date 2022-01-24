class Solution {
    public int findPeakElement(int[] nums) {
      int mid,left=0,n=nums.length,right=n-1;
      while(left<=right)
      {
          mid=(left+right)/2;
          if(mid!=0 && mid!=n-1)
          {
              
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(nums[mid]<nums[mid-1])
            {
                right=mid-1;
            }
            else
                left=mid+1;
          }
          else // For extreme elements at index 0 or n-1.
          {
            if(mid==0)
            {   if(nums.length==1) // only one element in the array
                    return 0;
                else if(nums[mid]>nums[mid+1])
                    return mid;
                else return mid+1;
            }
            else
            {
                return mid;
            }
          }
      }
      return 1; //for the sake of returning
    }
}
