class Solution {
    public String solution(String s) {
    String answer = "";

    String[] arrSplit = s.split(" ");
    for(int i=0; i<arrSplit.length; i++) {
      char[] arrChar = arrSplit[i].toCharArray();
      answer = answer + strConvert(arrChar);

      if(i < (arrSplit.length-1)){
        answer = answer + " ";
      }

    }

    if(s.length() != answer.length()){
      int diff = s.length() - answer.length();
      for(int i=0; i< diff; i++){
        answer = answer + " ";
      }
    }

    return answer;
  }

  private String strConvert(char[] arrChar){
    String value = "";
    for(int i=0; i<arrChar.length; i++){
      if( i % 2 == 0){
        value = value + String.valueOf(arrChar[i]).toUpperCase();
      } else {
        value = value + String.valueOf(arrChar[i]).toLowerCase();
      }
    }

    return value;
  }
}