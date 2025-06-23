class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;

        for (int i = 1; i <= s.length(); i++) 
        {
            if(i == s.length() || s.charAt(i) != s.charAt(start))
            {
                if(i - start >= 3)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i-1);
                    result.add(list);
                }
                start = i;
            }
        }

        return result;
    }
}
