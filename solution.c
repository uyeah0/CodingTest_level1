/*
Q. ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, 
solution�� �ϼ��غ�����.

*���ѻ���*
 arr�� ���� 1 �̻�, 100������ �迭
 arr�� ���Ҵ� -10,000 �̻� 10,000������ ����
*/

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>


// arr_len�� �迭 arr�� ����
double solution(int arr[], size_t arr_len) {
    double answer = 0;
    for (int i = 0; i < arr_len; i++) {
        answer += arr[i];
    }
    answer = answer / arr_len;
    return answer;
}