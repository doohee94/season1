package week_5;

import java.util.*;

public class SelectNum {

    public static int[] solution(int[] numbers) {

        Set<Integer> answerSet = new HashSet();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                answerSet.add(numbers[i] + numbers[j]);

            }

        }

        return answerSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

    }

}
