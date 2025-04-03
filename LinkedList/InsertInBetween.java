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
class InsertInBetween {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if (list1 == null && list2 == null) return null;

        ListNode firstNode = list1;
        ListNode endNode = list2;

        while (endNode.next != null) {
            endNode = endNode.next;
        }

        for (int i = 1; i < a; i++) {
            firstNode = firstNode.next;
        }

        ListNode secondNode = firstNode.next;

        for (int j = a; j <= b; j++) {
            secondNode = secondNode.next;
        }

        firstNode.next = list2;
        endNode.next = secondNode;
        
        return list1;
    }
}