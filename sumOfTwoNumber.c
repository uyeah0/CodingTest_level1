/*
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ��� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
*/

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long sumOfTwoNumber(int a, int b) {
    long long answer = 0;
    if (a > b) {
        answer = a;
        a = b;
        b = answer;
        answer = 0;
    }
    for (int i = a; i <= b; i++) {
        answer += i;
    }

    return answer;
}