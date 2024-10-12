import java.util.Arrays;

public class DuplicateElements {

    public static int duplicateElements(int[] array) {

        int j = 0;
        for(int i = 0; i < array.length; i++) {

            if(array[i] != array[j] ) {
                array[++j] = array[i];
            }
        }
        return j + 1;
    }
    public static void main(String[] args) {

               
        int[] array = {1, 1, 2, 3, 3, 3};

        int[] newArray = new int[duplicateElements(array)];

        
        for(int i = 0; i < duplicateElements(array); i++) {
            newArray[i] = array[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
