function solution(n) {
    var answer = -1;
        let a = Math.sqrt(n);
        if(Number.isInteger(a)==true){
            answer = Math.pow(a+1,2);
        }
    return answer;
}