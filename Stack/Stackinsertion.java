
import java.util.Scanner;

public class Stackinsertion {
    public static int Size() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the stack: ");
        int size = sc.nextInt();

        return size;
    }
    public static int Insertion(int size, int[] array, int top) {
        Scanner sc = new Scanner(System.in);

        if(top > size - 1) {
            System.out.println("The stack is full!");
        }
        else {
            System.out.println("Enter the stack element:");
            array[++top] = sc.nextInt();
            System.out.println("The Stack has been updated!");
        }
        return top;
    }

    public static int Deletion(int size, int[] array, int bottom) {
        Scanner sc = new Scanner(System.in);

        if(bottom == -1) {
            System.out.println("Stack is empty!");
        }
        else {
            array[--bottom] = 0;
            System.out.println("The current top element has been removed!");
        }
        return bottom;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int top = -1, bottom = -1;
        int size = Size();

        int[] stack = new int[size];

        System.out.println("Enter what you want to do with thw stack: ");
        System.out.println("1. Insertion into the stack");
        System.out.println("2. Deletion of the element from the stack");
        System.out.println("3. Print the Stack");
        System.out.println("Enter 0 to exit the program");

        int choice = sc.nextInt();

        if(choice == 0) {
            System.out.println("Exit();");
        }
        else {
            do { 

                switch (choice) {
                    case 1:
                        int pointer = Insertion(size, stack, top);
                        top = bottom = pointer;
                        break;
                    
                        case 2:
                        int point = Deletion(size, stack, bottom);
                        bottom = top = point;
                        break;
                    case 3: 
                        System.out.println("The Stack is: ");
                        if(top == -1) {
                            System.out.println("The stack is empty!");
                        }
                        else {
                            for(int i = 0; i <= top; i++) {
                                System.out.println(stack[i]);
                            }
                        }
                        break;
                    default:
                        System.out.println("Enter a valid choice!");
                }

                System.out.println("Enter what you want to do with thw stack: ");
                System.out.println("1. Insertion into the stack");
                System.out.println("2. Deletion of the element from the stack");
                System.out.println("3. Print the Stack");
                System.out.println("Enter 0 to exit the program");
    
                choice = sc.nextInt();
            } while (choice != 0);
        }
    }
}
