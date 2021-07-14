function solution(n) {
    var answer = 0;
    let arr = [];
    let s = n.toString();
    let len = s.length;
    for(let i =0; i < len;i++){
        arr[i] = s[i];
    }
    arr.sort(function(a,b){
        return b-a;
    })
    
    answer = parseInt(arr.join(''));
    
    return answer;
}