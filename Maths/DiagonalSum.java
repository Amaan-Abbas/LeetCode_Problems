
import java.util.Scanner;

public class DiagonalSum {

    public static int addSum (int[][] array) {

        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            if(i < array[i].length) {
                sum += array[i][i];
            }
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(j + i == array[i].length - 1) {
                    sum += array[i][j];
                }
            }
        }

        if(array.length % 2 != 0) {
            int num = (array.length - 1) / 2;

            sum -= array[num][num];
        }

        return sum;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the matrix: ");
            int n = sc.nextInt();
            
            int[][] array = new int[n][n];
            
            System.out.println("Enter the elements of the array: ");
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            
            System.out.println(addSum(array));
        }
    }
}