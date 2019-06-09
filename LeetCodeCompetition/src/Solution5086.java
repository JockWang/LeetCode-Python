import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5086 {
    List<Character> str;
    public String smallestSubsequence(String text) {
        char[] list = text.toCharArray();
        str = new ArrayList<>();
        String result = "";
        if(list.length != 0)
            for(int i = list.length-1;i >= 0;i --){
                isOK(list[i]);
            }
        for(int i = str.size()-1;i >= 0;i --){
            result += str.get(i);
        }
        return result;
    }
    public void isOK(char c){
        boolean flag = false;
        for(int i = 0;i < str.size();i ++){
            if(c == str.get(i)) {
                flag = true;
//                for(int j = str.size()-1;j > i;j --){
//                    if(c < str.get(j)){
//                        str.remove(i);
//                        str.add(j,c);
//                        return ;
//                    }
//                }
                if (c < str.get(str.size() - 1)) {
                    str.remove(i);
                    str.add(c);
                    break;
                }
            }
        }
        if(!flag)
            str.add(c);
    }
}
