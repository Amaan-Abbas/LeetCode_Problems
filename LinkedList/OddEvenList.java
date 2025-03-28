/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode evenHead = l2;
        ListNode oddHead = l1;

        ListNode copy = head;
        int count = 1;

        while (copy != null) {
            if (count % 2 == 0) {
                evenHead.next = copy;
                evenHead = copy;
            } else {
                oddHead.next = copy;
                oddHead = copy;
            }

            count++;
            copy = copy.next;
        }

        oddHead.next = l2.next;
        evenHead.next = null;

        return l1.next;
    }
}