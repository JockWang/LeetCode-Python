public class Solution66 {
    public int[] plusOne(int[] digits) {
        if(digits.length==0)
            return digits;
        int add = 1;
        for(int i = digits.length-1;i >= 0;i --){
            int temp = digits[i] + add;
            if(temp < 10){
                add = 0;
                digits[i] = temp;
            }else {
                add = temp/10;
                digits[i] = temp%10;
            }
        }
        if(add != 0){
            int[] result = new int[digits.length+1];
            result[0] = add;
            for(int i = 0;i < digits.length;i ++)
                result[i+1] = digits[i];
            return result;
        }
        return digits;
    }
}
