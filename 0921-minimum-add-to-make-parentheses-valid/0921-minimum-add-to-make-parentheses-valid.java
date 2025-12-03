class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int extra = 0;
        
        for(char c : s.toCharArray()){
            if(c == '(')
                stack.push(c);
            else if(c == ')' && !stack.isEmpty())
                stack.pop();  
            else 
                extra++;
          
            System.out.println(stack);
        }


        return stack.size() + extra;

    }
}