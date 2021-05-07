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
