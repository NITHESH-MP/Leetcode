class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if(strs.length <= 1){
            result.add(Arrays.asList(strs[0]));
            return result;
        }

        HashMap<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String s = sort(strs[i]);

            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(i);
        }

        for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            List<String> anagram = new ArrayList<>();

            for(int i = 0; i < list.size(); i++){
                anagram.add(strs[list.get(i)]);
            }

            result.add(anagram);
        }


        return result;
        
    }

    public String sort(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}