class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int s1 = 0, s2 = 0;
        StringBuilder result = new StringBuilder();

        while(s1 < word1.length() && s2 < word2.length())
        {
            result.append(word1.charAt(s1++));
            result.append(word2.charAt(s2++));
        }    

        while(s1 < word1.length())
            result.append(word1.charAt(s1++));
        while(s2 < word2.length())
            result.append(word2.charAt(s2++));

        return result.toString();
    }
}