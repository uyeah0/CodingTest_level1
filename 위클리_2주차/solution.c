#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// scores_rows�� 2���� �迭 scores�� �� ����, scores_cols�� 2���� �迭 scores�� �� �����Դϴ�.
char* solution(int** scores, size_t scores_rows, size_t scores_cols) {
    // return ���� malloc �� ���� �Ҵ��� ������ּ���. �Ҵ� ���̴� ��Ȳ�� �°� �������ּ���.
    char* answer = (char*)malloc(sizeof(char)*scores_rows);
    answer[0] = 0;
    int max,min;
    int cntX=0; // max�� � �ִ��� min�� � �ִ��� ���� ���� �Ǵ�
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
            cnt--;// max�� min�� �ڱ��ڽ��� ������ ������ ���ֱ�
        }
        avg = sum/cnt;
        switch(avg)
        
    }
    return answer;
}