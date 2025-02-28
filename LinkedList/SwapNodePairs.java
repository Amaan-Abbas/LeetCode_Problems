class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node node) {
        this.data = data;
        this.next = node;
    }
}

public class SwapNodePairs {
    Node head = null;

    public void insert(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node pairSwap(Node head) {
        if (head == null || head.next == null) return head;

        Node node = head;
        Node next = node.next;
        node.next = pairSwap(next.next);
        next.next = node;
        return next;
    }

    public static void main(String[] args) {
        SwapNodePairs node = new SwapNodePairs();
        node.insert(5);
        node.insert(4);
        node.insert(3);
        node.insert(2);
        node.insert(1);

        node.display();

        node.head = node.pairSwap(node.head);

        node.display();
    }
}