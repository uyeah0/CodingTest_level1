function solution(seoul) {
    var answer = '';
    for(let i =0; i < seoul.length; i++){
        if(seoul[i]=="Kim"){
            answer = "�輭���� " + i + "�� �ִ�";
        }
    }
    return answer;
}