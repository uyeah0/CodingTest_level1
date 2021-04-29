/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수를 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
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