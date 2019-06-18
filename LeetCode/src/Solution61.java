public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)
            return head;
        ListNode end = head;
        int length = 0;
        while(end.next!=null) {
            end = end.next;
            length ++;
        }
        length++;
        end.next = head;
        ListNode point = head;
        ListNode temp;
        k = k % length;
        for(int i = 0;i < length-k;i ++){
            point = point.next;
            end = end.next;
        }
//        while (k != 0){
//            while (point.next != end){
//                point = point.next;
//            }
//            temp = end.next;
//            end = point;
//            point = end.next;
//            point.next = temp;
//            k--;
//        }
        end.next = null;
        return point;
    }
}
