import java.util.ArrayList;
import java.util.List;

public class Solution5087 {
    int total;
    List<String> strings;
    public int numTilePossibilities(String tiles) {
        char[] list = tiles.toCharArray();
        strings = new ArrayList<>();
        total = 0;
        loop(list,"");
        return total;
    }
    public void loop(char[] list,String str){
        if(list.length == 1) {
            if(isOk(str+list[0])) {
                strings.add(str+list[0]);
                total += 1;
            }
        }else {
            for(int i = 0;i < list.length;i ++){
                String temp = new String(str);
                temp += list[i];
                if(isOk(temp)){
                    strings.add(temp);
                    total += 1;
                    char[] clist = new char[list.length-1];
                    int k = 0;
                    for(int j = 0;j < list.length;j ++){
                        if(j!=i) {
                            clist[k++] = list[j];
                        }
                    }
                    loop(clist,temp);
                }
            }
        }
    }
    public boolean isOk(String s){
        for(String str:strings){
            if(s.equals(str))
                return false;
        }
        return true;
    }
}
