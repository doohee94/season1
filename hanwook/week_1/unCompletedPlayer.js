function solution(participant, completion) {
  var answer = "";

  participant.sort();
  completion.sort();

  participant.some((v, i) => {
    if (v !== completion[i]) {
      answer = v;
    }

    return v !== completion[i];
  });

  return answer;
}
