class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> par = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(c == '[' || c == '{' || c == '(')
                par.push(c);
            else
            {
                if(par.isEmpty())
                    return false;
                
                char top = par.pop();
                if(c == ']' && top != '[' || c == '}' && top != '{' || c == ')' && top != '(')
                    return false;
            }

        }    
        
        return par.isEmpty();
    }
}