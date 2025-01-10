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
class AddTwoNumber02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(); //Useful for avoiding the special handeling of head node and simplifies the list constructions.
        ListNode temp = l3; //Using the pointer temp to construct the new list;
        int carry = 0; //to store the carry generated while adding the two lists

        while (l1 != null || l2 != null || carry != 0) { //using the conditions for checking that there is a value in the any of the nodes and if there is none and there still remains a carry then adding it to the last of the LinkedList.
            int val1 = (l1 != null) ? l1.val : 0; //At each step, add the corresponding digits from l1 and l2. If a list is shorter, assume the missing digits are 0.
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10; //Keep track of the carry for sums greater than 9.
            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return l3.next;
    }
}