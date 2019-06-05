import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        int[] nums = {1,2,3};
        Solution temp = new Solution();
        temp.permute(nums);
        temp.print();
    }
}

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<>();
        result = new ArrayList<>();
        for(int i:nums){
            numbers.add(i);
        }
        change(numbers,new ArrayList<Integer>());
        return result;
    }
    public void change(ArrayList<Integer> nums,ArrayList<Integer> list){
        if(nums.size() == 0){
            result.add(list);
            return;
        } else {
            for(int i = 0;i < nums.size();i ++){
                ArrayList<Integer> list1 = new ArrayList<>(list);
                list1.add(nums.get(i));
                ArrayList<Integer> num = new ArrayList<>(nums);
                num.remove(i);
                this.change(num,list1);
            }
        }
    }
    public void print(){
        for(int i = 0;i < result.size();i ++){
            for(int j = 0;j <result.get(i).size();j ++){
                System.out.print(result.get(i).get(j));
            }
            System.out.println("");
        }
    }
}
