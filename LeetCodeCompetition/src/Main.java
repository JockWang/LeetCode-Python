public class Main {
    public static void main(String[] args){
//        new Solution5083().findOcurrences("we will we will rock you","we","will");
//        System.out.println(new Solution5087().numTilePossibilities(""));
//        System.out.println(new Solution5086().smallestSubsequence("cbaacabcaaccaacababa"));
//        int[] temp = {1,2,0};
//        new Solution1089().duplicateZeros(temp);
        int[] values = {9,8,8,7,6};
        int[] labels = {0,0,0,1,1};
        int num_wanted = 3;
        int use_limit = 2;
        System.out.println(new Solution1090().largestValsFromLabels(values,labels,num_wanted,use_limit));
    }
}
