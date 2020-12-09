function solution(numbers) {
  var answer = [];

  for(var i = 0; i < numbers.length - 1; i++) {
      for(var j = i + 1; j < numbers.length; j++) {
          const n = numbers[i] + numbers[j];
          if(answer.includes(n)) continue;
          answer.push(n);
      }
  }    
  
  return answer.sort((a, b) => a - b);
}