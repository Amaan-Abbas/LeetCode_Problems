package DSA_Practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        
        String[] array = new String[5];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements of the String array: ");

        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = in.next();            
        }

        // for(String idx : array) {
        //     System.out.println(idx);
        // }

        System.out.println(Arrays.toString(array));

        System.out.println(array);

        in.close();
    }
}
