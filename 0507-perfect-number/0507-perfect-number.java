class Solution {
    public boolean checkPerfectNumber(int num) {
        
        long n = (long) num;
        
        if (n == 6L || n == 28L || n == 496L || n == 8128L || 
            n == 33550336L || n == 8589869056L || n == 137438691328L)
            return true;
        
        return false;
    }
}
