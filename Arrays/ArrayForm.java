import java.util.Scanner;

public class ArrayForm {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        double number = 0.0;
        for(int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        double newNumber = number + num;
        System.out.println(newNumber);

        // List<Integer> array = new ArrayList<>();

        // while(newNumber != 0) {
        //     int digit = (int)(newNumber % 10);
        //     array.add(0, digit);
        //     newNumber /= 10;
        // }
        // System.out.println(array);
    }
}
