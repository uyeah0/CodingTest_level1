/*
���� ����
���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
num�� int ������ �����Դϴ�.
0�� ¦���Դϴ�.
*/
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {
    // ������ ���� �޸𸮸� ���� �Ҵ����ּ���
    char* answer = (char*)malloc(sizeof(char) * 4);

    if (num % 2 != 0) {
        answer = "Odd";
    }
    else {
        answer = "Even";
    }
    return answer;
}}