public class CoinGame3222 {
    private static int count = 0;

    public static String winnerPlayer(int x, int y) {
        if (x >= 1 && y >= 4) {
            count++;
            winnerPlayer(x - 1, y - 4);
        }

        if (count % 2 != 0) {
            return "Alice";
        } else {
            return "Bob";
        }
    }

    public static void main(String[] args) {
        System.out.println(winnerPlayer(2, 7));
    }
}
