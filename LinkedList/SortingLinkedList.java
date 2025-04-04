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
class SortingLinkedList {

    //Function to split singally linked list into two halves
    public static ListNode split(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        //Move fast pointer two steps and slow one step until fast reaches the end
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            if (fast != null) {
                slow = slow.next;
            }
        }

        //Split the list into two halves
        ListNode temp = slow.next;
        slow.next = null;
        return temp;
    }

    //Function to merge two sorted singly Linked Lists
    public static ListNode merge (ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        tail.next = (first != null) ? first : second;
        return dummy.next;
    }

    //Function to perform merge sort on the singly linked list
    public ListNode sortList(ListNode head) {

        //Base case: if the list is empty or has only one node, it is already sorted
        if (head == null || head.next == null) return head;

        //Split the list into two halves
        ListNode second = split(head);

        //Recursively sort the two halves
        head = sortList(head);
        second = sortList(second);

        //Merge the two sorted halves
        return merge(head, second);
    }
}