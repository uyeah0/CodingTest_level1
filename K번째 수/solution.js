function compareNA(a,b){
                if(a>b) return 1;
                else if(a==b) return 0;
                else if(a<b) return -1;
            }
function solution(array, commands) {
    
    let answer = [];
    let a = [];
    let s,e,l, cnt =0, cntR=0;
    
        // console.log( commands.length);
         //console.log(commands.length);
        for(let i =0; i < commands.length; i++){
                s = commands[i][0];//2
                e = commands[i][1];//5
                l = commands[i][2];//3
            for(let j = s-1; j < e; j++ ){ // commands[0][1] ~ commands[0][4]
                a[cnt] = array[j];
                //console.log( cnt + " " + a[cnt]);
                cnt++;
            }
           // console.log("----");
            
            a.sort(compareNA);
           /* for(let k =0; k < cnt; k++ ){
                console.log(a[k]);
            }*/
            cnt =0;
            //console.log("====");
            answer[cntR] = a[l-1];
            //console.log(answer[cntR]);
            cntR++;
            a =[];
        }
    
    return answer;
}
