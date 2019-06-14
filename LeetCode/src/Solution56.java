import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        boolean flag = false;
        ArrayList<int []> list = new ArrayList<>();
        for(int i = 0;i < intervals.length;i ++){
            if(isOK(intervals[i],list) == true){
                flag = true;
            }
        }
        int [][] reslut = new int[list.size()][2];
        for(int i = 0;i < list.size();i ++){
            reslut[i][0] = list.get(i)[0];
            reslut[i][1] = list.get(i)[1];
        }
        if(flag)
            return merge(reslut);
        return reslut;
    }
    public boolean isOK(int[] nums,ArrayList<int []> list){
        boolean flag = false;
        for(int i = 0;i < list.size();i ++){
            if(list.get(i)[0] > nums[1]||list.get(i)[1] < nums[0])
                continue;
            flag = true;
            int [] temp = {nums[0],nums[1],list.get(i)[0],list.get(i)[1]};
            Arrays.sort(temp);
            int [] t = {temp[0],temp[3]};
            list.set(i,t);
        }
        if(!flag){
            list.add(nums);
        }
        return flag;
    }
}
