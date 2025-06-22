class Solution {
    public String[] divideString(String s, int k, char fill) 
    {
        String[] result = new String[(s.length() + k - 1) / k];

        int c=0,i=0;

        while(c!=result.length)
        {
            StringBuilder sb = new StringBuilder();
            
            for(int j=0;j<k;j++)
            {
                if(i<s.length())
                    sb.append(s.charAt(i++));
                else
                    sb.append(fill);
            }
            result[c++] = sb.toString();
        }

        return result;
    }
}