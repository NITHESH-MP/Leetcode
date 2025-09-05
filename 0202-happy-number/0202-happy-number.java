class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> set = new HashSet<>();

        while(n > 1)
        {
            if(set.contains(n))
                return false;
            else
                set.add(n);
            
            n = helper(n);
            
            
        } 

        return true;
    }

    public int helper(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int r = n % 10;
            sum += (r * r);
            n = n / 10;
        }

        return sum;
    }
}