class Solution {
    public int maxDistToClosest(int[] seats) {
        int i=-1,j=-1,distance=0,mid,n=seats.length;
        while(++i<n)
        {   
            if(seats[i]==1)
            {   if(j==-1)
                {
                    distance=i;
                }
                else if(i-j>distance && i-j>1)
                {
                    mid=(i+j)/2;
                    if(mid-j>distance)
                    {
                        distance=mid-j;
                    }
                }
                
                j=i;
                
            }
            
        } 
        if(seats[n-1]==0)
        {   if((n-1)-j>distance)
            distance=(n-1)-j;
        }
        
        
        return distance;
    }
}