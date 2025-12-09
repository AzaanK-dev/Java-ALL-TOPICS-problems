// Write a recursive method that counts the size of a connected region (1’s) in a binary image matrix, similar to flood-fill logic.

public class BinaryImgRegion {
    static int[][] img = {
        {0,1,1,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,1,0,0,0},
        {0,0,0,0,0,1,1},
        {0,1,1,1,0,1,0},
        {0,0,0,1,0,1,0}
    };

    public static int rl(int r,int c){
        // corrected boundary check
        if(r < 0 || r >= img.length || c < 0 || c >= img[0].length)
            return 0;

        if(img[r][c] == 0)
            return 0;
        else {
            img[r][c] = 0; // mark visited
            return (
                rl(r-1,c-1) + rl(r-1,c) + rl(r-1,c+1) +
                rl(r,c-1)   + 1         + rl(r,c+1)   +
                rl(r+1,c-1) + rl(r+1,c) + rl(r+1,c+1)
            );
        }
    }
    public static void main(String[] args) {
        int r = 3, c = 5;
        int res = rl(r,c);
        System.out.println("Size of connected region (1s) in this binary image is: "+res);
    }
}