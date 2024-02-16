public class ListNode {
 int val;
 ListNode next;
ListNode() {}
 ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1 = 0;
        int count1 = 1;
        ListNode cur1 = l1;
        ListNode prev = null;
        ListNode next = null;
        while (cur1.next != null) {
            System.out.print(cur1);
            System.out.print(cur1.val + " ");
            prev = cur1;

            cur1 = cur1.next;
            next = cur1.next;
            cur1.next = prev;
            cur1 = next;
        }
        cur1.next = prev;

        while (cur1.next != null) {
            sum1 += cur1.val * count1;
            cur1 = cur1.next;
        }
        return l1;
    }
}