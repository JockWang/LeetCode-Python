public class Main {
    public static void main(String[] args) {
//        int [] input ={-2};
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(6);
        a.next = b;b.next =c;c.next = d;
        ListNode h = new ListNode(1);
        ListNode i = new ListNode(3);
        ListNode j = new ListNode(5);
        ListNode k = new ListNode(7);
        h.next = i;i.next = j;j.next = k;
        Solution s = new Solution();
        s.Merge(a,h).print();
//        int temp = new Solution().maxProfit(input);
//        System.out.println(s.maxProduct(input));

    }
}
