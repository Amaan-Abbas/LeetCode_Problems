class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        next = null;
    }
}

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        Node list1 = new Node(0);
        Node list2 = new Node(0);
        Node list3 = new Node(0);

        Node smaller = list1;
        Node equals = list2;
        Node greater = list3;

        for (int i = 0; i < nums. length; i++) {
            Node node = new Node(nums[i]);
            if (nums[i] < pivot) {
                smaller.next = node;
                smaller = smaller.next; 
            } else if (nums[i] == pivot) {
                equals.next = node;
                equals = equals.next;
            } else {
                greater.next = node;
                greater = greater.next;
            }
        }

        smaller.next = list2.next;
        equals.next = list3.next;
        greater.next = null;

        Node start = list1.next;

        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        // int[] newList = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     newList[i] = list1.next.data;
        // }

        // return newList;
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        pivotArray(nums, pivot);
    }
}