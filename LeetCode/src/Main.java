import java.util.List;

import org.apache.kafka.clients.producer.*;

public class Main {
    public static void main(String args[]){
        String a = "11",b="111";
        System.out.println(new Solution67().addBinary(a,b));
//        int[] temp = {1,9};
//        print(new Solution66().plusOne(temp));
//        ListNode n1 = new ListNode(0);
//        ListNode n2 = new ListNode(1);
//        ListNode n3 = new ListNode(2);
//        ListNode n4 = new ListNode(4);
//        ListNode n5 = new ListNode(5);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = null;
//        n4.next = n5;
//        n5.next = null;
//        new Solution61().rotateRight(n1,6).print();
//        System.out.println(new Solution60().getPermutation(4,9));
//        new Solution59().generateMatrix(0);
//        int [][] input = {{3,4},{2,3}};
//        print(new Solution56().merge(input));
//        int [] jump = {3,2,1,0,4};
//        System.out.println(new Solution55().canJump(jump));
//        System.out.println(new Solution43().multiply("123456789","987654321"));
//        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        print(new Solution54().spiralOrder(matrix));
    }
//    public static void print(List<List<Integer>> list){
//        for(List li:list){
//            for(Object i:li){
//                System.out.print((int)i);
//            }
//            System.out.println("");
//        }
//    }
//    public static void print(List<Integer> list){
//        for(Integer i:list){
//            System.out.print(i+" ");
//        }
//    }
    public static void print(int[] list){
        for(int i:list)
            System.out.print(i+" ");
        System.out.println("");
//        for(int i = 0;i < list.length;i ++){
//            System.out.print("["+list[i][0]+","+list[i][1]+"]");
//        }
    }
}
