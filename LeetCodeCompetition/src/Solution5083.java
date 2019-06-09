import java.util.ArrayList;
import java.util.List;

public class Solution5083 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String [] texts = text.split(" ");
        boolean flag = false;
        for(int i = 1;i < texts.length;i ++){
            if(flag) {
                list.add(texts[i]);
                flag = false;
            }
            if(second.equals(texts[i]))
                if(first.equals(texts[i-1]))
                    flag = true;
        }
        String [] result = new String[list.size()];
        for(int i = 0;i < list.size();i ++) {
            result[i] = list.get(i);
            //System.out.println(result[i]);
        }
        return result;
    }
}
