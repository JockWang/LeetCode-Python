import java.util.ArrayList;
import java.util.List;

public class Solution60 {
    int count = 0;
    String str = "";
    boolean flag = false;
    public String getPermutation(int n, int k) {
        int [] nums = new int[n];
        for(int i = 0;i < n;i ++)
            nums[i] = (i+1);
        loop(nums,new ArrayList<Integer>(),k);
        return str;
    }
    public void loop(int[] nums,ArrayList<Integer> list,int k){
        if(nums.length == 0){
            this.count++;
            if(this.count == k){
                flag = true;
                for(int i = 0;i < list.size();i ++){
                    str+=list.get(i);
                }
            }
            return;
        }
        for(int i = 0;i < nums.length;i ++){
            ArrayList<Integer> temp = new ArrayList<>(list);
            temp.add(nums[i]);
            int [] arr = new int[nums.length-1];
            int m = 0;
            for(int j = 0;j < nums.length;j ++){
                if(j != i)
                    arr[m++] = nums[j];
            }
            loop(arr,temp,k);
            if(flag)
                return;
        }
    }
}
