function gcd(lowNum, highNum) {
    if(highNum % lowNum === 0) {
        return lowNum;
    }
    return gcd(highNum % lowNum, lowNum)
}

function solution(n, m) {
    var answer = [gcd(n, m), n * m / gcd(n, m)];
    return answer;
}