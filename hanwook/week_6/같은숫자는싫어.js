function solution(arr) {
  var answer = [];
  answer = arr.filter((f, i) => f !== arr[i - 1]);
  return answer;
}