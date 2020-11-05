import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
    List<Character> upperList = new ArrayList<>();
    List<Character> lowerList = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      char charValue = s.charAt(i);
      if (Character.isUpperCase(charValue)) {
        upperList.add(charValue);
      } else {
        lowerList.add(charValue);
      }
    }

    Collections.sort(upperList, Collections.reverseOrder() );
    Collections.sort(lowerList, Collections.reverseOrder() );
    lowerList.addAll(upperList);
//    StringBuilder stringBuilder = new StringBuilder();

    for (Character character : lowerList) {
//      stringBuilder.append(character);
      answer = answer + character;
    }

//    answer = stringBuilder.toString();
    return answer;
    }
}