function solution(d, budget) {
    let answer = 0, sum =0;
    for(let i =0;i < d.length-1; i++){
        for(let j =i+1; j < d.length; j++ ){
            if(d[i] > d[j]){
                let t = d[i];
                d[i] = d[j];
                d[j] =t;
            }
        }
    }
    let i;
    for(i =0; sum <= budget; i++){
        sum += d[i];
        answer++;
    }
    
    return answer-1;
}