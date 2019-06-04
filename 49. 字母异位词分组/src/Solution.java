import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map hasmap = new HashMap<String,ArrayList<String>>();
        for(String s:strs){
            String temp = new String(s);
            char[] temp_list = temp.toCharArray();
            Arrays.sort(temp_list);
            temp = new String(temp_list);
            if(!hasmap.containsKey(temp)){
                ArrayList<String> str = new ArrayList<String>();
                str.add(s);
                hasmap.put(temp,str);
            }else {
                ArrayList<String> arrList = (ArrayList<String>)hasmap.get(temp);
                arrList.add(s);
                hasmap.put(temp,arrList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Object v:hasmap.values()){
            result.add((ArrayList<String>)v);
        }
//        for(int i = 0;i < result.size();i++){
//            for(int j = 0;j < result.get(i).size();j ++){
//                System.out.print(result.get(i).get(j)+" ");
//            }
//            System.out.println("");
//        }
        return result;
    }
}  