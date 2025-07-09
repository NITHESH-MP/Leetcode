class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s.length() == 0)
            return true;
            
        int l = 0, r = s.length() - 1;

        while(l<r)
        {
            
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;            
        } 

        return true;   
    }
}