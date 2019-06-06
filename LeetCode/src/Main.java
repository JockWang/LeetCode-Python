import java.util.List;

public class Main {
    public static void main(String args[]){
        int [] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Solution40 s = new Solution40();
        print(s.combinationSum2(candidates,target));
    }
    public static void print(List<List<Integer>> list){
        for(List li:list){
            for(Object i:li){
                System.out.print((int)i);
            }
            System.out.println("");
        }
    }
}
