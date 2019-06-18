public class Solution67 {
    public String addBinary(String a, String b) {
        char[] result,cA,cB;
        if(a.length() > b.length()){
            cA = a.toCharArray();
            cB = new char[a.length()];
            char[] bb = b.toCharArray();
            for(int i = 0;i < cB.length;i ++){
                if(cB.length-i>bb.length)
                    cB[i] = '0';
                else
                    cB[i] = bb[bb.length-cB.length+i];
            }
            result = new char[a.length()+1];
        }else {
            cA = new char[b.length()];
            cB = b.toCharArray();
            char[] aa = a.toCharArray();
            for(int i = 0;i < cA.length;i ++){
                if(cA.length-i>aa.length)
                    cA[i] = '0';
                else
                    cA[i] = aa[aa.length-cA.length+i];
            }
            result = new char[b.length()+1];
        }
        char add = '0';
        for(int i = cA.length-1;i >= 0;i --){
            if(cA[i] == '1' && cB[i] == '1' && add == '0') {
                result[i+1] = '0';
                add = '1';
            }
            else if(cA[i] == '1' && cB[i] == '1' && add == '1'){
                result[i+1] = '1';
            }else if(cA[i] == '0' && cB[i] == '0' && add == '0'){
                result[i+1] = '0';
            }else if(cA[i] == '0' && cB[i] == '0' && add == '1'){
                result[i+1] = '1';
                add = '0';
            }else if(add == '1'){
                result[i+1] = '0';
            }else {
                result[i+1] = '1';
            }
        }
        String str = "";
        if(add == '1') {
            result[0] = '1';
            for(int i = 0;i < result.length;i ++){
                str += result[i];
            }
        }else {
            for(int i = 1;i < result.length;i ++){
                str += result[i];
            }
        }
        return str;
    }
}
