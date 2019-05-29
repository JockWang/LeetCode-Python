import java.util.*;
class Solution {
    public int minDistance(String word1, String word2) {
        return 0;
    }
    List<List<Integer>> resList;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        /*回溯递归*/
        resList = new ArrayList<>();
        getCombinationSum(candidates,target,new ArrayList<Integer>(),0);
        return resList;
    }
    public void getCombinationSum(int[] candidates,int target,List<Integer> numList,int start){
        if(target == 0){
            ArrayList<Integer> list = new ArrayList<Integer>(numList);
            resList.add(list);
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(target-candidates[i]>=0){
                numList.add(candidates[i]);
                getCombinationSum(candidates,target-candidates[i],numList,i);
                numList.remove(numList.size()-1);
            }
        }
    }
}