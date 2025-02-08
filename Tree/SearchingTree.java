package Tree;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}
public class SearchingTree {

    static boolean searchDFS(Node root, int value) {

        if (root == null) return false;

        if (root.data == value) return true;

        boolean left_res = searchDFS(root.left, value);

        boolean right_res = searchDFS(root.right, value);

        return left_res||right_res;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(7);
        root.right = new Node(11);
        root.left.left = new Node(15);
        root.left.right = new Node(89);

        root.right.left = new Node(14);

        int value = 11;
        if(searchDFS(root, value)) {
            System.out.println(value + " is present in the tree.");
        } else {
            System.out.println(value + " is not present in the tree.");
        }
    }
}
