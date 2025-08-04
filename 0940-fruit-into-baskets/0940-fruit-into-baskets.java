class Solution {
    public int totalFruit(int[] fruits)
    {
        int start = 0;
        int end = 0;
        int max = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        while(end < fruits.length)
        {
            freq.put(fruits[end], freq.getOrDefault(fruits[end], 0) + 1);

            while(freq.size() > 2)
            {
                freq.put(fruits[start], freq.getOrDefault(fruits[start], 0) - 1);
                if(freq.get(fruits[start]) == 0)
                    freq.remove(fruits[start]);
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;   
    }
}