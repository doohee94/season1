function solution(s) {
  var answer = '';
  
  answer = s.split(' ')
      .map((s) => s
           .split('')
           .map((ss, i) => i % 2 === 0 ? ss.toUpperCase() : ss.toLowerCase())
           .join(''))
      .join(' ');
  
  return answer;
}