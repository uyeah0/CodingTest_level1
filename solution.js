/*
�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
*/
function solution(s) {
    var answer = s;
    
    if((answer.length)%2==0){       
        answer = answer.substr((answer.length)/2-1,2);
    }else{
        answer = answer.substr((answer.length)/2,1);     
    }
    return answer;
}
