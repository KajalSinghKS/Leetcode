class Solution {
public:
    bool isSubsequence(string s, string t) {
        int sub,str=0;
        
        if(s.length() == t.length())
        {
            if(s.compare(t) == 0)
                return true;
            else return false;
        }
        if(s.length() > t.length())
            return false;
        
        
        for(int sub=0; sub<s.length();sub++)
        {
            if(t[str]==s[sub])
            {
                str++;
                continue;
            }
            else
            {
                
                while(1)
                {   
                    if(str == t.length())
                        return false;
                    if(t[str] == s[sub])
                    {
                        str++;
                        break;
                    }
                    else
                    {
                        str++;
                        continue;
                    }
                        
                }
            }
            
        }
        
        return true;
    }
};