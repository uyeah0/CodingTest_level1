#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int num[] = {0,1,2,3,4,5,6,7,8,9};
    int y[10] = {0,};
    
    for(int i = 0; i < numbers_len; i++){
        for(int j = 0; j < 10; j++){
            if(numbers[i] == num[j]) {
                y[j]++;
            }
        }
        
    }
    for(int j =0;j < 10; j++){
            if(y[j] == 0) {
                printf("%d ", num[j]);
                answer+=num[j];
            }
            y[j] = 0;
        }
    return answer;
}
