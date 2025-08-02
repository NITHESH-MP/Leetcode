class Solution {
    public int longestBeautifulSubstring(String word) 
    {
       int i = 0;
       int maxlen = 0;

        while(i < word.length())
        {
            if(word.charAt(i) == 'a')
            {
                i++;
                int len = 1;
                int vowel = 1;
                while(i < word.length() && word.charAt(i) >= word.charAt(i-1))
                {
                    if(word.charAt(i) != word.charAt(i-1))
                        vowel++;
                    i++;
                    len++;
                }
                
                if(vowel == 5)
                    maxlen = Math.max(maxlen, len);

            }
            else
                i++;
        }

        return maxlen;
    }
}