import java.util.List;

public class Main {
    public static void main(String args[]){
        new Solution59().generateMatrix(0);
//        int [][] input = {{3,4},{2,3}};
//        print(new Solution56().merge(input));
//        int [] jump = {3,2,1,0,4};
//        System.out.println(new Solution55().canJump(jump));
//        System.out.println(new Solution43().multiply("123456789","987654321"));
//        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        print(new Solution54().spiralOrder(matrix));
    }
//    public static void print(List<List<Integer>> list){
//        for(List li:list){
//            for(Object i:li){
//                System.out.print((int)i);
//            }
//            System.out.println("");
//        }
//    }
//    public static void print(List<Integer> list){
//        for(Integer i:list){
//            System.out.print(i+" ");
//        }
//    }
    public static void print(int[][] list){
        for(int i = 0;i < list.length;i ++){
            System.out.print("["+list[i][0]+","+list[i][1]+"]");
        }
    }
}
