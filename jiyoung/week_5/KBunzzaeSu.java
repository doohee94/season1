import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for(int i=0; i < commands.length; i++){
      answer[i] = getNum(array, commands[i]);
    }

    return answer;
  }

  private int getNum(int[] array, int[] command){
    int[] splitArray = Arrays.copyOfRange(array, command[0]-1,command[1]);
    Arrays.sort(splitArray);
    
    return splitArray[command[2]-1];
  }
}