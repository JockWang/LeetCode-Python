public class Solution1175 {
    public int numPrimeArrangements(int n) {
        int count = 0;
        if(n <= 2)
            return 0;
        else {
            for(int i = 3;i < n+1;i ++){
                boolean flag = false;
                for(int j = 2;j < i;j ++){
                    if(i%j == 0){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    count ++;
                }
            }
        }
        int a = 1;
        int b = 1;
        for(int i = 1;i < count+1;i ++){
            a *= i;
        }
        for(int i = 1;i < (n-count)+1;i ++){
            b *= i;
        }
        return a*b%(1000000007);
    }
}
