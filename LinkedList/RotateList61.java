package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RotateList61 {
    public int Size(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        for(int i = 1; i <= k; i++) {
            if (head == null || head.next == null) return head;
            
            ListNode node = head;
            ListNode tail  = node.next;
            for (int j = 1; j <= Size(node); j++) {
                if (tail.next == null) break;

                node = tail;
                tail = tail.next;
            }

            ListNode temp = head;
            head = tail;
            head.next = temp;
            node.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        RotateList61 RL = new RotateList61();
    }
}