class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length; 
        int i = 0;
        
        if(n == 1)
            return true;
              

        while(i < n - 1){
            if(bits[i] == 0)
                i++;
            else
                i = i + 2;
        }

        System.out.println(i);

        return i == n - 1? true : false; 

    }
}