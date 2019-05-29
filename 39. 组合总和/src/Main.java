import java.util.List;

public class Main {
    public static void main(String args[]){
        int [] candidates = {8,7,4,3};
        int target = 11;
        print(new Solution().combinationSum(candidates,target));
    }
    public static void print(List<List<Integer>> list){
        for(int i = 0;i < list.size();i ++){
            for(int j = 0;j < list.get(i).size();j ++)
                System.out.print(list.get(i).get(j));
            System.out.println("");
        }
    }
}
