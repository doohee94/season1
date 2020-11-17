class Solution {
    public int[] solution(int[] answers) {
    int su1 = 0;
    int su2 = 0;
    int su3 = 0;

    for(int i=0; i<answers.length; i++){
      if(answers[i]==su1(i%10)){
        su1++;
      }
      if(answers[i]==su2(i%8)){
        su2++;
      }
      if(answers[i]==su3(i%10)){
        su3++;
      }
    }

    if(su1 > su2){
      if(su1 == su3){
        return new int[]{1,3};
      }
      return su1 > su3 ? new int[]{1} : new int[]{3} ;
    } else if(su1 == su2){
      if(su1 == su3){
        return new int[]{1,2,3};
      }
      return su1 > su3 ? new int[]{1,2} : new int[]{3};
    } else {
      if(su2 == su3){
        return new int[]{2,3};
      }
      return su2 > su3 ? new int[]{2} : new int[]{3};
    }
  }

  private int su1(int i){
    int[] su1 = {1,2,3,4,5,1,2,3,4,5};
    return su1[i];
  }

  private int su2(int i){
    int[] su1 = {2,1,2,3,2,4,2,5};
    return su1[i];
  }

  private int su3(int i){
    int[] su3 = {3,3,1,1,2,2,4,4,5,5};
    return su3[i];
  }
}