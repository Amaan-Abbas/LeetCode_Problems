package Tree;

import java.util.LinkedList;
import java.util.Queue;

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

    static void levelOrderBFS(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);

        System.out.println("In-Order tarversal: ");
        inOrderDFS(root);

        System.out.println("Pre-Order traversal: ");
        preOrderDFS(root);

        System.out.println("Post-Order traversal: ");
        postOrderDFS(root);

        System.out.println("Level-Order traversal: ");
        levelOrderBFS(root);
    }
}
