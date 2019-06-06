import java.util.*;

public class Solution40 {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        Arrays.sort(candidates);
        ArrayList<Integer> cand = new ArrayList<Integer>();
        for(int i:candidates)
            cand.add(i);
        change(cand,0,target,new ArrayList<Integer>());
        return result;
    }
    public void change(ArrayList<Integer> candidates,int now,int target,ArrayList<Integer> list){
        if(now < target){
            for(int i = 0;i < candidates.size();i ++){
                if(i != 0){
                    now -= candidates.get(i-1);
                }
                if(now+candidates.get(i) <= target) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    ArrayList<Integer> l = new ArrayList<>(list);
                    l.add(candidates.get(i));
                    now += candidates.get(i);
                    for(int k = i+1;k < candidates.size();k ++){
                        temp.add(candidates.get(k));
                    }
                    change(temp, now, target, l);
                }else {
                    break;
                }
            }
        }else if(now == target){
            ArrayList<Integer> l = new ArrayList<>(list);
            if(notIn(l))
                result.add(l);
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
