package Tree;

class Node{
    int data;
    Node left, right;

    public Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

public class TraversalTree {
    static void inOrderDFS(Node node) {
        if (node == null) return;
        inOrderDFS(node.left);
        System.out.println(node.data + " ");
        inOrderDFS(node.right);
    }

    static void preOrderDFS(Node node) {
        if (node == null) return;
        System.out.println(node.data + " ");
        preOrderDFS(node.left);
        preOrderDFS(node.right);
    }

    static void postOrderDFS(Node node) {
        if (node == null) return;
        postOrderDFS(node.left);
        postOrderDFS(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.print("In-Order tarversal: ");
        inOrderDFS(root);

        System.out.println();

        System.out.print("Pre-Order traversal: ");
        preOrderDFS(root);

        System.out.println();

        System.out.print("Post-Order traversal: ");
        postOrderDFS(root);
    }
}
