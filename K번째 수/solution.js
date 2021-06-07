function solution(array, commands) {
    
    let answer = [];
    let a = [];
    let s,e,l, cnt =0, cntR=0;
    
        // console.log( commands.length);
        // console.log(commands[0].length);
        for(let i =0; i < commands[0].length; i++){
                s = commands[i][0];//2
                e = commands[i][1];//5
                l = commands[i][2];//3
            for(let j = s-1; j < e; j++ ){ // commands[0][1] ~ commands[0][4]
                a[cnt] = array[j];
                cnt++;
            }
            cnt =0;
            for(let i =0; i < a.length-1; i++){
                 for(let j = i+1; j < a.legnth; j++){
                   if(a[i] > a[j]) {
                       let t = a[i];
                       a[i] = a[j];
                       a[j] = t;
                  }
              }
            }
            answer[cntR] = a[l-1];
            cntR++;
        }
    console.log(answer.length);
    return answer;
}