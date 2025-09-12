class Solution {
    public boolean doesAliceWin(String s) {
        
        int vowelsCount = 0;
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1)
                vowelsCount++;
        }

        if(vowelsCount >= 1)
            return true;
        
        return false;

    }
}