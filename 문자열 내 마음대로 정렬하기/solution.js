function solution(strings, n) {
    var answer = strings.slice();

    for(let i =0; i < answer.length-1; i++){
        for(let j = i+1; j < answer.length; j++){
            if(answer[i][n] > answer[j][n]){
                let t = answer[i];
                answer[i] = answer[j];
                answer[j] = t;
            }else if(answer[i][n] == answer[j][n]){
               if(answer[i] > answer[j]){
                  let  t = answer[i];
                    answer[i] = answer[j];
                    answer[j] = t;
                } 
            }
        }
    }
    console.log(answer);
    return answer;
}