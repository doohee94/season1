package week_2;

import java.time.LocalDate;

public class DateCheck {

    public static String solution(int a, int b) {

        String []dow = {"","MON","TUE","WED","THU","FRI","SAT","SUN"};
        LocalDate date = LocalDate.of(2016,a,b);
        return dow[date.getDayOfWeek().getValue()];
    }
    public static void main(String[] args) {
        System.out.println(solution(4,5));
    }

}
