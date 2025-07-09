class Solution {
    public boolean validPalindrome(String s) 
    {
        StringBuilder s1 = new StringBuilder(s);
        int l = 0, r = s1.length() - 1, flag = 0;

        while(l<r)
        {
            if(s1.charAt(l) != s1.charAt(r))
            {
                StringBuilder s2 = new StringBuilder(s1);
                s2.deleteCharAt(l);
                if(isPalindrome(s2))
                    return true;
                
                StringBuilder s3 = new StringBuilder(s1);
                s3.deleteCharAt(r);
                if(isPalindrome(s3))
                    return true;
                
                return false;
            }
            l++;
            r--;
        }

        return true;  
    }


    public Boolean isPalindrome(StringBuilder sb)
    {
        int l = 0, r = sb.length()-1;

        while(l<r)
        {
            if(sb.charAt(l) != sb.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    } 
}