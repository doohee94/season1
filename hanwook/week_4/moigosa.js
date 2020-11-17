function solution(answers) {
  var answer = [];
  
  var p1 = [1, 2, 3, 4, 5];
  var p2 = [2, 1, 2, 3, 2, 4, 2, 5];
  var p3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
  
  var pcArr = new Array(3).fill(0);
  
  
  for (var i = 0; i < answers.length; i++) {
      var a = answers[i]
      if (a === p1[i % 5]) pcArr[0]++;
      if (a === p2[i % 8]) pcArr[1]++;
      if (a === p3[i % 10]) pcArr[2]++;
  }
  
  var maxNum = pcArr.slice().sort((a, b) => a - b)[pcArr.length - 1];
  
  answer = pcArr.reduce((acc, cur, i) => {
      if (maxNum === cur) {
          acc.push(i + 1);
      }
      return acc;
  }, [])
  
  
  return answer;
}