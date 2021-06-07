function solution(a, b) {
    var answer = [];
    let m,n,r= 1;
    if(a>b) {
            m = a;
            n = b;
        }else{
            m = b;
            n = a;
        }
    while(r){
        r = m%n
        if(r!=0){
            m = n;
            n = r;
        }
    }
    answer[0] = n;
    answer[1] = a*b/n;
    return answer;
}