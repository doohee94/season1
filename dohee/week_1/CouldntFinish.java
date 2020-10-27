package week_1;

import java.util.HashMap;
import java.util.Map;

public class CouldntFinish {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> completionMap = getAthletesMaps(completion);

        for (String part : participant) {
            if(!completionMap.containsKey(part)){
                answer = part;
                break;
            }
            
        }


        return answer;
    }
//
//    public static String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        Map<String, Integer> participantMap = getAthletesMaps(participant);
//        Map<String, Integer> completionMap = getAthletesMaps(completion);
//
//        for (Map.Entry<String, Integer> partMap : participantMap.entrySet()) {
//            if(!completionMap.containsKey(partMap.getKey())){
//                answer = partMap.getKey();
//                break;
//            }
//
//            if(!partMap.getValue().equals( completionMap.get(partMap.getKey()))){
//                answer = partMap.getKey();
//                break;
//            }
//
//        }
//
//
//        return answer;
//    }

    private static Map<String, Integer> getAthletesMaps(String[] athletes) {

        Map<String, Integer> map = new HashMap<>();

        for (String athlete : athletes) {
            if (map.containsKey(athlete)){
                int value = map.get(athlete);
                map.put(athlete,++value);
                continue;
            }
            map.put(athlete,0);
        }


        return  map;
    }


    public static void main(String[] args) {

        String []part = {"leo", "kiki", "eden"};
        String []comp = {"eden", "kiki"};
        System.out.println(solution(part, comp));
    }
}
