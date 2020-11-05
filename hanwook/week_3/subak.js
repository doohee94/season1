function solution(n) {
    var answer = '';
    
    var subak = new Array(n).fill("수")
    
    for(var i = 1; i < n; i+=2) {
        subak[i] = "박"
    }
    
    answer = subak.join('');
    
    return answer;
}