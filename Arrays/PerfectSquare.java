public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        
        int start = 0, end = num;

        if(num == 0 || num == 1) {
            return true;
        }

        if (num % 2 != 0) {
            return false;
        }

        while (start <= end) {

            int mid = start + (end - start)/2;

            if(mid == num / mid) {
                return true;

            }
            else if(num/mid < mid) {
                end = (int)mid - 1;
            }
            else { 
                start = (int)mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        PerfectSquare sc = new PerfectSquare();
        System.out.println(sc.isPerfectSquare(36));
    }
}