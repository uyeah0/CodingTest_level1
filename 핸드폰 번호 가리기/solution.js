function solution(phone_number) {
    var answer = '';
    let cnt =0;
    
    
    while(cnt < phone_number.length-4){
            answer += '*';
            cnt++;      
    } 
    for(let i = phone_number.length-4; i < phone_number.length; i++ ){                         answer += phone_number.charAt(i);
    }
    return answer;
}