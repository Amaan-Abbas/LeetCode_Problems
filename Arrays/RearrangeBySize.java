class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        next = null;
    }
}


public class RearrangeBySize {
    public int[] rearrangeArray(int[] nums) {
        Node lst1 = new Node(0);
        Node lst2 = new Node(0);

        Node l1 = lst1;
        Node l2 = lst2;

        for (int i = 0; i < nums.length; i++) {
            Node add = new Node(nums[i]);
            if (nums[i] < 0) {
                l1.next = add;
                l1 =  add;
            } else {
                l2.next = add;
                l2 = add;
            }
        }

        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                newArray[i] = lst2.next.data;
                lst2.next = lst2.next.next;
            } else {
                newArray[i] = lst1.next.data;
                lst1.next = lst1.next.next;
            }
        }

        return newArray;
    }
}