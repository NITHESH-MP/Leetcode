class Solution {
    public String sortVowels(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        String vowels = "aeiouAEIOU";

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1)
                pq.add(c);
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(vowels.indexOf(c) != -1)
                result.append(pq.poll());
            else
                result.append(c);
        }
        
       return result.toString();
    }
}