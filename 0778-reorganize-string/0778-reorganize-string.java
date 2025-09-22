class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char c : s.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0)+1);

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();

        Map.Entry<Character, Integer> prev = null;

        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> curr = maxHeap.poll();

            result.append(curr.getKey());

            curr.setValue(curr.getValue() - 1);
            
            if(prev != null && prev.getValue() > 0)
                maxHeap.add(prev);
            
            prev = curr;
        }
        
        if(result.length() != s.length())
            return "";

        return result.toString();
    }
}