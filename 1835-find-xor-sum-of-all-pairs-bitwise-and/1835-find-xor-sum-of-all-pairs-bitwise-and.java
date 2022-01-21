class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int XOR1=0,XOR2=0;
        for(int i=0;i<arr1.length;i++)
        {
            XOR1^=arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            XOR2^=arr2[j];
        }
        return XOR1 & XOR2;
    }
}