/*
���� ����
���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

�̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)
*/
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i =0; i <a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}