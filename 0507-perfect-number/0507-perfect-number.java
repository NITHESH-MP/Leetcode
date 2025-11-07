class Solution {
    public boolean checkPerfectNumber(int num) {
        
        if(num == 1)
            return false;
        
        int sum = 1;
        int n = (int) Math.sqrt(num);

        for(int i = 2; i <= n; i++){
            if(num % i == 0)
            {
                sum += i;
                if(i != num / i)
                    sum += num/i;
            }
        }

        return sum == num ? true : false;

    }
}
