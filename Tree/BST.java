package Tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BST {
    public static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key) {
            root.left = insert(root.left, key);
        } else {
            root.right =  insert(root.right, key);
        }

        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int key) {
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            Node IS = inOrderSuccessor(root);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node node) {
        if (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public static void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        int[] var = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < var.length; i++) {
            root = insert(root, var[i]);
        }

        System.out.println("The BST is: ");
        inOrderTraversal(root);

        //insert(root, 7);

        System.out.println();
        // inOrderTraversal(root);

        
    }
}
