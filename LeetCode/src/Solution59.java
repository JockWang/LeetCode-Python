public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0,right = n-1,up = 0, bottom = n-1;
        int number = 1;
        while (true){
            for(int i = left;i <= right;i ++)
                result[up][i] = number++;
            if(++up > bottom) break;
            for(int i = up;i <= bottom;i ++)
                result[i][right] = number++;
            if(--right < left) break;
            for(int i = right;i >= left;i --)
                result[bottom][i] = number++;
            if(--bottom < up) break;
            for(int i = bottom;i >= up;i --)
                result[i][left] = number++;
            if(++left > right) break;
        }
        for(int i = 0;i < result.length;i ++){
            for(int j = 0;j < result[i].length;j ++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
        return result;
    }
}
