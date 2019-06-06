import java.util.*;

class Solution47 {
    List<List<Integer>> result;
    public List<List<Integer>> permuteUnique(int[] nums) {
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
            if(notIn(list))
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
    public boolean notIn(ArrayList<Integer> list){
        for(int i = 0;i < result.size();i ++){
            if(list.size() == result.get(i).size()) {
                boolean flag = true;
                for (int j = 0; j < result.get(i).size(); j++) {
                    if (result.get(i).get(j) != list.get(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag)
                    return false;
            }
        }
        return true;
    }
}