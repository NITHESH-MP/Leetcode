class Solution {
    public int minimumOperations(int[] nums) {
        
        int op = 0;
        int i = 0;
        int prev = 0;
        

        while(true){
            HashSet<Integer> set = new HashSet<>();
            boolean duplicated = false;

            while(i < nums.length){
                if(!set.contains(nums[i]))
                    set.add(nums[i++]);
                else{
                    op++;
                    i = prev + 3;
                    prev = i;
                    duplicated = true;
                    break;
                }
            }    
            if(!duplicated)
                break;     
        }

        return op;

    }
}