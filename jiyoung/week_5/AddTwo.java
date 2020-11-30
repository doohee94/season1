import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
    List<Integer> array = new ArrayList<>();
    int beforeNum = -1;

    Arrays.sort(numbers);
    for(int i = 0; i < (numbers.length-1) ; i++){
      if(beforeNum == numbers[i]){
        continue;
      }
      for(int j = i+1; j < numbers.length; j++){
        array.add(numbers[i]+numbers[j]);
      }
    }

    List<Integer> distinctArray = array.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue)).collect(Collectors.toList());
    int[] answer = new int[distinctArray.size()];

    for(int k=0; k<distinctArray.size(); k++){
      answer[k] = distinctArray.get(k);
    }

    return answer;
  }
}