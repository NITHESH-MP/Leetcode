class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;

        for(int n : nums){
            freq[n]++;
            maxFreq = Math.max(maxFreq, freq[n]);
        } 

        int result = 0;

        for(int i = 0; i < 101; i++){
            if(freq[i] == maxFreq)
                result += maxFreq;
        }
        
        return result;
    }
}