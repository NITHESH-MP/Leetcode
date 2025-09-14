class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int i = 0;
        HashSet<String> wordslist = new HashSet<>(); 
        HashMap<String, String> words = new HashMap<>();
        HashMap<String, String> normalised = new HashMap<>();
        
        String[] result = new String[queries.length];
         
        for(String s : wordlist)
        {
            wordslist.add(s);

            String lowercase = s.toLowerCase();
            String norm = normalise(s.toLowerCase());
            if(words.get(lowercase) == null)
                words.put(lowercase, s);
            if(normalised.get(norm) == null)
                normalised.put(norm, s); 

        }   
            
        
        for(String s : queries)
        {
            if(wordslist.contains(s))
                result[i++] = s;
            else 
            {
                String lower = s.toLowerCase();
                String norm  = normalise(lower);

                if (words.containsKey(lower))
                    result[i++] = words.get(lower);
                else if (normalised.containsKey(norm))
                    result[i++] = normalised.get(norm);
                else 
                    result[i++] = "";
            }
        }

        return result;
    }

    public String normalise(String s)
    {
        String vowels = "aeiouAEIOU";
        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(vowels.contains(s.charAt(i)+""))
                sb.append("*");
            else
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}