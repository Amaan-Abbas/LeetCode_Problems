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
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public static void main(String[] args) {
        LinkedListReverse LLR = new LinkedListReverse();
        LLR.insert(1);
        LLR.insert(2);
        LLR.insert(3);
        LLR.insert(4);
        LLR.insert(5);

        LLR.reverse();

        LLR.display();
    }
}
