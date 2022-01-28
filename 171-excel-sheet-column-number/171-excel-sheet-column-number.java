class Solution {
    public int titleToNumber(String columnTitle) {
        int power=columnTitle.length()-1,colNo=0;
        for(int i=0;i<columnTitle.length();i++)
        {   
            colNo+= (columnTitle.charAt(i)-64)*Math.pow(26,power);
            power--;
        }
        
        return colNo;
    }
};