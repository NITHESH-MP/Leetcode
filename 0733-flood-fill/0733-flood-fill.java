class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        if(color == 0)
            return image;
        int img = image[sr][sc];

        fill(image, sr, sc, color, img);

        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color, int img){

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return;
        
        if(image[sr][sc] == color || image[sr][sc] != img)
            return;
        
        if(image[sr][sc] == img)
            image[sr][sc] = color;
        
        fill(image, sr + 1, sc, color, img);
        fill(image, sr - 1, sc, color, img);
        fill(image, sr, sc + 1, color, img);
        fill(image, sr, sc - 1, color, img);

    }
}