class Solution {
    public String strWithout3a3b(int a, int b) {
        
        StringBuilder sb = new StringBuilder();
        int n = a+b;
        int aCount = 0, bCount = 0;
        
        while(a > 0 || b > 0)
        {
            if(aCount == 2)
            {
                sb.append('b');
                b--;
                bCount++;
                aCount = 0;
            }
            else if(bCount == 2){
                sb.append('a');
                a--;
                aCount++;
                bCount = 0;
            }
            else if(a > b){
                sb.append('a');
                a--;
                aCount++;
                bCount = 0;
            }
            else
            {
                sb.append('b');
                b--;
                bCount++;
                aCount = 0;
            }
        }
        
        
        return sb.toString();
    }
}