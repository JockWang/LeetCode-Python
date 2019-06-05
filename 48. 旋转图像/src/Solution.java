class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length-1;
        for(int i = 0;i < matrix.length/2;i ++){
            for(int j = i;j < length-i;j ++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[length-j][i];
                matrix[length-j][i] = matrix[length-i][length-j];
                matrix[length-i][length-j] = matrix[j][length-i];
                matrix[j][length-i] = temp;

            }
        }

//        for(int i = 0;i < matrix.length;i ++){
//            for(int j = 0;j < matrix[i].length;j ++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
}