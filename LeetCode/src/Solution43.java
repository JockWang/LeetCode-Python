import java.util.ArrayList;
import java.util.List;

public class Solution43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        String result = "";
        int[] number1 = changetoNum(num1);
        int[] number2 = changetoNum(num2);
        List<Integer> res = new ArrayList<>();
        for(int i = number2.length-1;i >= 0;i --){
            List<Integer> row = new ArrayList<>();
            for(int k = number2.length-1-i;k > 0;k --) {
                row.add(0);
            }
            int next = 0;
            for(int j = number1.length-1;j >= 0 ;j --){
                int nextOne = 0;
                int temp = number2[i]*number1[j]+next;
                if(temp > 9){
                    nextOne = temp/10;
                    temp = (temp-nextOne*10);
                }
                row.add(temp);
                next = nextOne;
                if(j == 0&& next != 0)
                    row.add(next);
            }
            next = 0;
            for(int m = 0;m < row.size();m ++){
                if(res.size()<=m){
                    int nextOne = 0;
                    int temp = row.get(m)+next;
                    if(temp > 9){
                        nextOne = temp/10;
                        temp = (temp-nextOne*10);
                    }
                    res.add(temp);
                    next = nextOne;
                    if(m==row.size()-1&&next!=0)
                        res.add(next);
                }else {
                    int nextOne = 0;
                    int temp = res.get(m)+row.get(m)+next;
                    if(temp > 9){
                        nextOne = temp/10;
                        temp = (temp-nextOne*10);
                    }
                    res.set(m,temp);
                    next = nextOne;
                    if(m==row.size()-1&&next!=0)
                        res.add(next);
                }
            }
        }
        for(int i = res.size()-1;i >=0;i --){
            result += res.get(i).toString();
            res.remove(i);
        }
        return result;
    }
    public int[] changetoNum(String num){
        char[] numChar = num.toCharArray();
        int[] result = new int[numChar.length];
        for(int i = 0;i < numChar.length;i ++){
            result[i] = Integer.parseInt(numChar[i]+"");
        }
        return result;
    }
}
