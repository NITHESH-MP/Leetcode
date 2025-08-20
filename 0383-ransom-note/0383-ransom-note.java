class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : magazine.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        
        for(char c : ransomNote.toCharArray())
        {
            if(freq.getOrDefault(c, 0) > 0)
                freq.put(c, freq.get(c)-1);
            else
                return false;
        }

        return true;
    }
}