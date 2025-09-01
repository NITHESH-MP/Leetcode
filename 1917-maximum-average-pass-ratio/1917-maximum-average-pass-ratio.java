class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) 
    {

        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b) -> Double.compare(b[1], a[1]));

        for(int i = 0; i < classes.length; i++)
        {
            int p = classes[i][0];
            int t = classes[i][1];

            double gain = ((double)(p + 1) / (t + 1)) - ((double)p / t);

            maxHeap.add(new double[]{i, gain});
        }

        for(int i = 0; i < extraStudents; i++)
        {
            double[] top = maxHeap.poll();
            int j = (int)top[0];
            classes[j][0]++;
            classes[j][1]++;

            int p = classes[j][0];
            int t = classes[j][1];

            double gain = ((double)(p + 1) / (t + 1)) - ((double)p / t);

            maxHeap.add(new double[]{j, gain});
            
        }

        double result = 0;

        for(int i = 0; i < classes.length; i++)
        {
            result += (double) classes[i][0] / classes[i][1];
        }

        return result/classes.length;
        
    }
}