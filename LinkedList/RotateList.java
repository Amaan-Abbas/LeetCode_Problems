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
class RotaeList {
    // public int Size(ListNode node) {
    //     int size = 0;
    //     while (node != null) {
    //         size++;
    //         node = node.next;
    //     }
    //     return size;
    // }

    // public ListNode rotateRight(ListNode head, int k) {
    //     int size = Size(head);
    //     if (size  == 0) return head;

    //     for(int i = 1; i <= k % size; i++) {
    //         if (head.next == null) return head;
            
    //         ListNode node = head;
    //         ListNode tail  = node.next;
    //         for (int j = 1; j <= Size(node); j++) {
    //             if (tail.next == null) break;

    //             node = tail;
    //             tail = tail.next;
    //         }

    //         ListNode temp = head;
    //         head = tail;
    //         head.next = temp;
    //         node.next = null;
    //     }

    //     return head;
    // }

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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) return head;

    ListNode tail = head;
    int n = 1;
    while (tail.next != null) {
        tail = tail.next;
        n++;
    }

    tail.next = head;
    int newTailIndex = n - (k % n);
    ListNode newTail = head;
    for (int i = 0; i < newTailIndex - 1; i++) {
        newTail = newTail.next;
    }

    ListNode newHead = newTail.next;
    newTail.next = null;

    return newHead;
}
}
}