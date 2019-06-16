public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int total = 0;
        int point = 0;
        boolean flag = false;
        for(int i = 0;i < arr.length;i ++){
            if(arr[i] != 0)
                total++;
            else
                total+=2;
            if(total >= arr.length){
                if(total > arr.length)
                    flag = true;
                point = i;
                break;
            }
        }
        int end = arr.length-1;
        for(int i = point;i >= 0;i--){
            if(i == point && arr[i] == 0 && flag){
                arr[end--] = 0;
            }else if(i == point && arr[i] == 0 && !flag){
                arr[end--] = 0;
                arr[end--] = 0;
            }else if(arr[i] == 0){
                arr[end--] = 0;
                arr[end--] = 0;
            }else {
                arr[end--] = arr[i];
            }
        }
//        for(int i = 0;i < arr.length;i ++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
    }
}
