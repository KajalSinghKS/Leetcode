import java.util.*;
class Solution {
    public String addBinary(String a, String b) {
        int carry=0,sum,value,i=a.length()-1,j=b.length()-1;
        String str="";
        
        while(i>=0||j>=0)
        {   sum=carry;
            if(i>=0) sum+=Character.getNumericValue(a.charAt(i--));
            if(j>=0) sum+=Character.getNumericValue(b.charAt(j--));
            
            carry= sum/2;
            value= sum%2;
            str=Integer.toString(value)+str;
        }
        
        if(carry==1)
            str="1"+str;
        
        return str;
    }
}