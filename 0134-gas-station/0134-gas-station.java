class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curGas = 0;
        int totalCost = 0;
        int totalGas = 0;

        for(int i = 0 ; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost)
            return -1;
        
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            curGas = curGas + (gas[i] - cost[i]);
            if(curGas < 0){
                start = i+1;
                curGas = 0;
            }
        }
        


        return start;
    }
}