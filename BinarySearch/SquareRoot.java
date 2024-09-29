//Program to find the square root without using the Math.sqrt() method.
//The program utilises the binary search algorithm to find the square root of the number provided.

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want to find the square root: ");
        int number = sc.nextInt();

        int start = 0, end = number;

        while(start < end) {

            int mid = start + (end - start)/2;

            if(mid * mid == number) {
                System.out.println(mid + " is the square root of " + number);
                break;
            }
            else if(mid * mid > number) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        sc.close();
    }
}
