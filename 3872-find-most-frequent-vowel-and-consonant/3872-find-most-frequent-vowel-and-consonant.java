class Solution {
    public int maxFreqSum(String s) {
        
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        
        String vowels = "aeiouAEIOU";
        int vmax = 0;
        int cmax = 0;
        
        for(HashMap.Entry<Character, Integer> entry : freqMap.entrySet())
        {
            if(vowels.contains(entry.getKey()+"")) 
            {
                if(entry.getValue() > vmax)
                    vmax = entry.getValue();
            }
            else
            {
                if(entry.getValue() > cmax)
                    cmax = entry.getValue();
            }    
        }
        
        return cmax + vmax;

    }
}