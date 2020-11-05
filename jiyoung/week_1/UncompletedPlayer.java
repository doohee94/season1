import java.util.Arrays;
import java.util.List;
class Solution {
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";

    List<String> arrParticipant = Arrays.asList(participant);
    List<String> arrCompletion = Arrays.asList(completion);

    arrParticipant.sort(String::compareTo);
    arrCompletion.sort(String::compareTo);

    for(int i=0; i<arrParticipant.size(); i++){
      if(i == arrParticipant.size()-1){
        answer = arrParticipant.get(i);
        break;
      }
      
      if(!arrParticipant.get(i).equals(arrCompletion.get(i))){
        answer = arrParticipant.get(i);
        break;
      }
      
    }

    return answer;
    }
}