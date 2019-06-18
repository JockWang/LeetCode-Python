public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    public void print(){
        if(this.next!=null) {
            System.out.print(this.val + "->");
            this.next.print();
        }
        else System.out.println(this.val);
    }
}
