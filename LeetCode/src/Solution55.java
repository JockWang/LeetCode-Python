public class Solution55 {
    public boolean canJump(int[] nums) {
        int point = 0;
        if(nums.length == 0 || nums.length == 1) return true;
        else {
            point = nums.length-1;
            for(int i = nums.length-2;i >= 0;i --){
                if(nums[i]>=point-i){
                    point = i;
                }
            }
        }
        if(point == 0)
            return true;
        else return false;
    }
//    boolean result
//    public boolean canJump(int[] nums) {
//        result = false;
//        if(nums.length == 0 || nums.length == 1) return true;
////        loop(nums);
//        return result;
//    }
//    public void loop(int [] nums){
//        if(!result) {
//            if ((nums.length == 0) || (nums.length == 1)) {
//                result = true;
//                return;
//            } else {
//                for (int i = 1; i <= nums[0]; i++) {
//                    if (nums.length - i >= 0) {
//                        int[] temp = new int[nums.length - i];
//                        int k = i;
//                        for (int j = 0; j < nums.length - i; j++) {
//                            temp[j] = nums[k++];
//                        }
//                        loop(temp);
//                    }
//                }
//            }
//        }
//    }
}
