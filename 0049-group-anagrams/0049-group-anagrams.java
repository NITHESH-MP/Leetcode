class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> result = new ArrayList<>();

        if(strs.length == 0 || strs.length == 1)
        {
            result.add(new ArrayList<>(Arrays.asList(strs[0])));
            return result;
        }

        String[] temp = new String[strs.length];
        int i = 0;

        for(String s : strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            temp[i++] = new String(arr); 
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for(i = 0; i < strs.length; i++)
        {
            String key = temp[i];

            if(map.containsKey(key))
                map.get(key).add(strs[i]);
            else
            {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }

        }

        result.addAll(map.values());
        return result;
    }
}