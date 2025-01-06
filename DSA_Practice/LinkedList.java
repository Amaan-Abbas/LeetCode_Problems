class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedList{
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.size = 0;
    }

    public void insertionStart(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertionEnd(int value) {
        if (tail == null) {
            insertionStart(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertionInMid(int value, int position) {
        if (position == 0) {
            insertionStart(value);
            return;
        }

        if (position == size) {
            insertionEnd(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < position; i++) {
            temp = temp.next;
        }

        temp.next = new Node(value, temp.next);
        size++;
    }

    public  int deleteStart() {
        int temp = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return temp;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteStart();
        }

        int value = tail.value;
        tail = get(size - 1);
        tail.next = null;
        size--;
        return value;
    }

    Node get(int index) {
        Node node = head;
        for(int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteStart();
        }

        if (index == size) {
            return deleteLast();
        }

        Node prevNode = get(index - 1);
        int value = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        return value;
    }

    public void display() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.insertionStart(15);
        LL.insertionStart(70);
        LL.insertionStart(18);
        LL.insertionStart(11);
        LL.insertionInMid(5, 2);
        LL.insertionInMid(1, 2);
        LL.insertionInMid(7, 2);
        LL.insertionInMid(11, 2);
        LL.insertionEnd(8);
        LL.insertionEnd(6);
        LL.insertionStart(10);

        LL.display();

    }
}