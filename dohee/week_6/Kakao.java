package week_6;

public class Kakao {


    public String solution(int[] numbers, String hand) {
        String answer = "";

        int[] leftHand = {3, 0};
        int[] rightHand = {3, 2};

        for (int number : numbers) {
            int[] nextValue = test(number);

            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftHand = nextValue;

            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightHand = nextValue;
            } else {


                double rightDist = getDist(nextValue, rightHand);
                double leftDis = getDist(nextValue, leftHand);

                String tempAnswer = "";

                if (rightDist == leftDis) {
                    tempAnswer = hand.equals("left") ? "L" : "R";
                } else {
                    tempAnswer = rightDist > leftDis ? "L" : "R";
                }

                if (tempAnswer.equals("L")) {
                    leftHand = nextValue;
                } else {
                    rightHand = nextValue;
                }

                answer += tempAnswer;

            }


        }


        return answer;
    }

    private double getDist(int[] number, int[] hand) {

        int tempI = number[0];
        int tempJ = number[1];

        return Math.abs(hand[0] - tempI) + Math.abs(hand[1] - tempJ);
    }


    private int[] test(int number) {

        int[][] keypad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {-1, 0, -1}
        };

        int tempI = 0;
        int tempJ = 0;

        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                if (keypad[i][j] == number) {
                    tempI = i;
                    tempJ = j;
                    break;
                }
            }
        }

        return new int[]{tempI, tempJ};

    }

}
