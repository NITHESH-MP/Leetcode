class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        
        StringBuilder prefix = new StringBuilder(strs[0]);

        for(int i = 1; i < strs.length; i++)
        {
            String s = strs[i];
            int j = 0;
            while(j < s.length() && j < prefix.length())
            {
                if(prefix.charAt(j) != s.charAt(j))
                    break;
                j++;
            }

            prefix.setLength(j);

            if(prefix.length() == 0)
                return "";
        }

        return prefix.toString();
    }
}