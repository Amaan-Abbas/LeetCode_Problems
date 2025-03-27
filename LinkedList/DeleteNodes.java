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
class DeleteNodes {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        } else if (head.next == null && head.val == val) {
            return null;
        } else if (head.next == null && head.val != val) {
            return head;
        }

        ListNode prevNode = null;
        ListNode fakeHead = head;

        while (fakeHead != null) {
            if (fakeHead.val == val) {
                if (prevNode == null) {
                    fakeHead = fakeHead.next;
                    head = fakeHead;
                } else {
                    prevNode.next = fakeHead.next;
                    fakeHead = fakeHead.next;
                }
            } else {
                prevNode = fakeHead;
                fakeHead = fakeHead.next;
            }
        }

        return head;
    }
}