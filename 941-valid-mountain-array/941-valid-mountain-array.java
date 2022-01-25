class Solution {
    public boolean validMountainArray(int[] arr) {
        int peak=0;
        for(int i=1;i<arr.length;i++)
        {   
            
            if(peak==1)
            {
                if(arr[i]>=arr[i-1])
                    return false;
            }
            else
            {   
                if(arr[i]<=arr[i-1])
                {
                    if(i>=2 && arr[i]<arr[i-1])
                        peak=1;
                    else return false;    
                }
            }
        }
        if(peak==0)
            return false;
        else return true;
    }
}