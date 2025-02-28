class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Node(int data, Node next) {
    //     this.data = data;
    //     this.next = next;
    // }
}

public class LinkedListReverse {
    Node head = null;

    public void insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void display() {
        Node node = head;

        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void reverseBetween(int left, int right) {
        // if (head == null) return head;

        Node dummy = new Node(0);
        dummy.next = head;

        Node preNode = dummy;
        Node currentNode = head;

        for(int i = 1; i < left; i++) {
            preNode = preNode.next;
            currentNode = currentNode.next;
        }

        Node subHeadNode = currentNode;

        Node previous = null;

        for (int i = 1; i <= right - left + 1; i++){
            Node nextNode = currentNode.next;
            currentNode.next = previous;
            previous = currentNode;
            currentNode = nextNode;
        }

        preNode.next = previous;
        subHeadNode.next = currentNode;
        
    }

    public static void main(String[] args) {
        LinkedListReverse LLR = new LinkedListReverse();
        // LLR.insert(1);
        // LLR.insert(2);
        // LLR.insert(3);
        // LLR.insert(4);
        // LLR.insert(5);

        //reverseBetween won't work for the below data unless you take the function as a returning function.
        LLR.insert(5);
        LLR.insert(3);

        // LLR.reverse();

        // LLR.display();
        
        LLR.reverseBetween(2, 4);

        LLR.display();
    }
}
