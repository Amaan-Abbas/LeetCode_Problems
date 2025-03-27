class ListNode {
    int value;
    ListNode next;

    // ListNode() {}

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

public class ReverseList {

    ListNode head = null;

    void reorderList() {
        if (head == null || head.next == null) return;
        
        //Find the middle point of the list
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (pointer2.next != null && pointer2.next.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }

        //reverse the next half of the list
        ListNode preMiddle = pointer1;
        ListNode preCurrent = pointer1.next;

        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        //Print the desired order;
        pointer1 = head;
        pointer2 = preMiddle.next;

        while(pointer1 != preMiddle) {
            preMiddle.next = pointer2.next;
            pointer2.next = pointer1.next;
            pointer1.next = pointer2;
            pointer1 = pointer2.next;
            pointer2 = preMiddle.next;
        }

        if (pointer1 == preMiddle && pointer2 != null) {
            pointer1.next = pointer2;
        }
    }

    public void insertNode(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        ListNode copy = head;

        while (copy != null) {
            System.out.print(copy.value + " -> ");
            copy = copy.next;
        }

        System.out.println("END");
    }

    public static void main(String[] args) {
        
        ReverseList ob = new ReverseList();
        ob.insertNode(6);
        ob.insertNode(5);
        ob.insertNode(4);
        ob.insertNode(3);
        ob.insertNode(2);
        ob.insertNode(1);

        ob.display();

        ob.reorderList();

        ob.display();

    }
}
