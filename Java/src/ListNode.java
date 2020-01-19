public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public void print(){
        System.out.print(this.val);
        if(this.next != null)
            this.next.print();
        else
            System.out.println("");
    }
}
