#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// scores_rows는 2차원 배열 scores의 행 길이, scores_cols는 2차원 배열 scores의 열 길이입니다.
char* solution(int** scores, size_t scores_rows, size_t scores_cols) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char* answer = (char*)malloc(sizeof(char)*scores_rows);
    answer[0] = 0;
    int max,min;
    int cntX=0; // max가 몇개 있는지 min이 몇개 있는지 같은 점수 판단
    double avg = 0.0,sum = 0.0;
    int cnt = scores_rows;
    
    for(int i=0; i < scores_rows; i++){
        max = -1, min = 101;
        for(int j = 0; j < scores_cols; j++){
            if( max < scores[i][j]) max = scores[i][j];
            else if(min > scores[i][j]) min = scores[i][j];
            sum+=scores[i][j];
        }
        for(int j = 0; j < scores_cols; j++){
            if(max == scores[i][j]){ cntX++;}
            else if(min == scores[i][j]) cntX--;
        }
        if(max == scores[i][i] || min == scores[i]]i) {
            sum -= scores[i][i]; 
            cnt--;// max와 min이 자기자신의 점수와 같으면 빼주기
        }
        avg = sum/cnt;
        switch(avg)
        
    }
    return answer;
}