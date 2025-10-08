class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int[] result = new int[spells.length];
        
        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i++)
        {
            long minPotion = (success + spells[i] - 1) / spells[i];

            result[i] = binarySearch(potions, minPotion);
        }

        return result;

    }

    public int binarySearch(int[] potions,long minPotion){
        int l = 0;
        int r = potions.length;
        

        while(l < r){
            int mid = (l + r) / 2;

            if(potions[mid] < minPotion)
                l = mid + 1;
            else
                r = mid;
        }

        return potions.length - l;
    }
}