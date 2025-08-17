class Solution {
    public double angleClock(int hour, int minutes) 
    {
        double h = 30 * hour;
        double m = (11.0 / 2) * minutes;
        
        double result = Math.abs(h - m);

        return Math.min(result, 360 - result);    
    }
}