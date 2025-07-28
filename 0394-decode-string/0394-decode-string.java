class Solution {
    public String decodeString(String s) 
    {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while(i < s.length())
        {
            if(s.charAt(i) != ']')
            {
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ']')
            {
                StringBuilder str = new StringBuilder();

                while(stack.peek() != '[')
                    str.insert(0,stack.pop());
                
                stack.pop();

                StringBuilder num = new StringBuilder();

                while(!stack.isEmpty() && Character.isDigit((stack.peek())))
                    num.insert(0, stack.pop());

                int n = Integer.parseInt(num.toString());

                for(int j = 0;j<n;j++)
                    for(int k = 0;k<str.length();k++)
                        stack.push(str.charAt(k));
            }
            i++;
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
        {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}