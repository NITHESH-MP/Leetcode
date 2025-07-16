class Solution {
    public String reverseWords(String s) 
    {
        StringBuilder result = new StringBuilder();
        StringBuilder str = new StringBuilder();
        int i = s.length()-1;

        while(i>=0)        
        {
            while(i>=0 && s.charAt(i) == ' ' && str.length() == 0)
                i--;
            
            if(i>=0 && s.charAt(i) != ' ')
            {
                str.append(s.charAt(i));
                i--;
            }
            if(i>=0 && s.charAt(i) == ' ' && str.length() != 0)
            {
                result.append(str.reverse());
                result.append(' ');
                str = new StringBuilder();
                i--;
            }
        }
        if(str.length() != 0)
        {
            result.append(str.reverse());
            return result.toString();
        }

        return result.deleteCharAt(result.length()-1).toString();
    }
}