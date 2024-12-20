public class PredictTheWinner486 {

    //returns the maxPoint index
    public static int maxNummber(int[] nums) {
        int number = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if (number < nums[i]) {
                number = nums[i];
                index = i;
            }
        }
        return index;
    }

    //returns the beast approach for the player1 to win
    public static  boolean bestApproach(int[] nums, int i) {
        int stepsFront = 0, stepsBack = 0;

        for(int j = 0; j < nums.length; j += 2) {
            if(j <= i) {
                stepsFront += 1;
            } else {
                break;
            }
        }

        for(int j = nums.length - 1; j >= 0; j -= 2) {
            if (j >= i) {
                stepsBack += 1;
            } else {
                break;
            }
        }

        return stepsFront > stepsBack;
    }

    public static boolean Winner(int[] nums) {
        int index = maxNummber(nums);
        int score1 = 0, score2 = 0;

        if (bestApproach(nums, index) == true) {
            for(int i = 0; i < nums.length; i++) {
                if(i%2 == 0) {
                    score1 += nums[i];
                } else {
                    score2 += nums[i];
                }
            }
        } else {
            for(int i = nums.length - 1; i >= 0; i--) {
                if (nums.length%2 == 0) {
                    if(i%2 == 0) {
                        score1 += nums[i];
                    } else {
                        score2 += nums[i];
                    }
                } else {
                    if (i%2 != 0) {
                        score1 += nums[i];
                    } else {
                        score2 += nums[i];
                    }
                }
            }
        }
        return score1 >= score2;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 11, 4};

        if (Winner(nums)) {
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }
}
