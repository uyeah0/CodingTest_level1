/*
���� ����
���̰� ���� �� 1���� ���� �迭 a, b�� �Ű������� �־����ϴ�. a�� b�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

�̶�, a�� b�� ������ a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] �Դϴ�. (n�� a, b�� ����)
*/
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// a_len�� �迭 a�� �����Դϴ�.
// b_len�� �迭 b�� �����Դϴ�.
int solution(int a[], size_t a_len, int b[], size_t b_len) {
    int answer = 0;
    
    for(int i =0; i < a_len; i++){
        answer += a[i] * b[i];
    }
    
    return answer;
}