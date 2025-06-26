class Solution
{
    public static char[] sorting(String s)
    {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return a;
    }

    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> answer = new ArrayList<>();

        if(strs.length == 0 || strs.length==1)
        {
            List<String> anagram = new ArrayList<>();
            anagram.add(strs[0]);
            answer.add(anagram);
        }
        else
        {
            Map<String,List<String>> map = new HashMap<>();
            String key = new String();
            
            for(int i=0;i<strs.length;i++)
            {
                key = String.valueOf(sorting(strs[i])); 

                if(!map.containsKey(key))
                    map.put(key, new ArrayList<>());
                
                map.get(key).add(strs[i]);
            }

            answer.addAll(map.values());
            
        }
        
        return answer;

    }

}