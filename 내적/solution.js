/*
���� ����
���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

�̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)
*/
function solution(a, b) {
    let answer = 0;
    
    for(let i = 0; i < a.length; i++){
        answer += a[i]*b[i];
    }
    return answer;
}