public class Solution1090 {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        int [] temp = new int[num_wanted];
        int [] nums = new int[num_wanted];
        for(int i = 0;i < temp.length;i ++){
            temp[i] = -1;
        }
        int total = 0;
        int use = 0;
        for(int i = 0;i < labels.length;i ++){
            if(use < num_wanted && count(temp,labels[i]) < use_limit){
                temp[use] = labels[i];
                nums[use++] = values[i];
            }
        }
        return total;
    }
    public int count(int [] temp,int m){
        int count = 0;
        for(int i = 0;i < temp.length;i ++){
            if(temp[i] == m){
                count++;
            }
        }
        return count;
    }
}
