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
class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode preNode = dummy;
        ListNode currentNode = head;

        for(int i = 1; i < left; i++) {
            preNode = preNode.next;
            currentNode = currentNode.next;
        }

        ListNode subHeadNode = currentNode;

        ListNode previous = null;

        for (int i = 1; i <= right - left + 1; i++){
            ListNode nextNode = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = nextNode;
        }

        preNode.next = previous;
        subHeadNode.next = currentNode;

        return dummy.next;        
    }
}