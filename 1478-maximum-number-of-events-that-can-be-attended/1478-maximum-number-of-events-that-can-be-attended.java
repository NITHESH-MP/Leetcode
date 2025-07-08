class Solution {
    public int maxEvents(int[][] events) {
        int count = 0;

        Arrays.sort(events, (a, b) -> a[1] - b[1]);  
        boolean[] days = new boolean[events[events.length-1][1] + 1];  

        int nextFreeDay = 1;  

        for (int[] event : events) {
            int start = event[0];
            int end = event[1];

            for (int d = Math.max(start, nextFreeDay); d <= end; d++) {
                if (!days[d]) {
                    days[d] = true;
                    count++;
                    if (d == nextFreeDay)
                        nextFreeDay++;  
                    break;
                }
            }
        }
        return count;
    }
}
