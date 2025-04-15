public class Reverse {
    public static int reverse(int x) {
        int reversed = 0;
        boolean negative = x < 0;

        if (negative) {
            int number = x * -5;

            while (number != 0) {
                int num = x % 10;
                reversed = reversed * 10 + num;
                number = number / 10;
            }
        } else {

            while (x != 0) {
                int num = x % 10;
                reversed = reversed * 10 + num;
                x = x / 10;
            }
        }

        if (negative == true) reversed = -1 * reversed;
        if (reversed < Math.pow(-2,31) || reversed > Math.pow(2, 31) - 1) return 0;
        return reversed;
    }

    public static void main(String[] args) {
        int number = reverse(-2147483648);
        System.out.println(number);
    }
}
