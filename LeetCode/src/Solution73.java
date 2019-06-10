import java.util.ArrayList;
import java.util.List;

public class Solution73 {
    List<Integer> row;
    List<Integer> col;
    public void setZeroes(int[][] matrix) {
        row = new ArrayList<>();
        col = new ArrayList<>();
        for(int i = 0;i < matrix.length;i ++){
            for(int j = 0;j < matrix[i].length;j ++){
                if(matrix[i][j] ==0){
                    if(isOK(i,0))
                        row.add(i);
                    if(isOK(j,1))
                        col.add(j);
                }
            }
        }
        for(int i = 0;i < row.size();i ++){
            for(int j = 0;j < matrix[i].length;j ++)
                matrix[row.get(i)][j] = 0;
        }
        for(int i = 0;i < matrix.length;i ++){
            for(int j = 0;j < col.size();j ++){
                matrix[i][col.get(j)] = 0;
            }
        }
    }
    public boolean isOK(int i,int model){
        if(model == 0)
            for(Integer r:row) {
                if (r == i)
                    return false;
            }
        else
            for(Integer c:col){
                if(c == i)
                    return false;
            }

        return true;
    }
}
