class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];

        int prefixEnd = strs[0].length();

        for(int i = 1; i < strs.length; i++){
            String s = strs[i];
            int j = 0;
            while(j < s.length() && j < prefixEnd){
                if(s.charAt(j) != strs[0].charAt(j))
                    break;
                j++;
            }
            prefixEnd = j;
            if(prefixEnd == 0)
                return "";
        }

        String prefix = "";
        for(int i = 0; i < prefixEnd; i++)
            prefix += strs[0].charAt(i);

        return prefix;
    }
}