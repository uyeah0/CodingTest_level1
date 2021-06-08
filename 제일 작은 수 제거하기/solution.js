function solution(arr) {
    var answer = [];
    
    if(arr.length==1) {
        answer.push(-1);
        return answer;
    }else{
        let a = arr.concat();
        a.sort((a,b) => a-b);
        let min = a[0];
        for(let i =0; i < arr.length; i++){
            if(min != arr[i]) answer.push(arr[i]);
        }        
        return answer;    
    }
    
}