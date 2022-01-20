
class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int mid,left=1,right=1000000000,total_hours;
    
        while(left<=right)
        {
            mid=(left+right)/2;
            int total_hours=0;
            for(int i:piles)
            {   
                
                total_hours+=i/mid;
                if(i%mid!=0)
                total_hours++;
            }
            if(total_hours<=h)
            {
              right=mid-1;
            }
            else left=mid+1;
                
        }
        
        return left;
     }
    
};


