class Solution 
{
    public String gen(String word)
    {
        String s = new String();
        
        for(int i = 0; i < word.length(); i++)
        {
            char a = word.charAt(i);

            s += (char)(a+1); 
        }
        
        return s;
    }

    public char kthCharacter(int k) 
    {
        String word = new String();
        word = word+'a';

        while(word.length() < k)
        {
            word = word + gen(word);
        }

        return word.charAt(k-1);    
    }
}