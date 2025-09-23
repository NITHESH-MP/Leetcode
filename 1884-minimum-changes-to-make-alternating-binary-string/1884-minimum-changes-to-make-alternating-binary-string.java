class Solution {
    public int minOperations(String s) {
        
        int way1 = 0;
        int way2 = 0;

        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            if((i % 2 == 0 && ch != '0') || (i % 2 != 0 && ch != '1'))
                way1++;
            
            if((i % 2 == 0 && ch != '1') || (i % 2 != 0 && ch != '0'))
                way2++;
        }

        return Math.min(way1, way2);

    }
}