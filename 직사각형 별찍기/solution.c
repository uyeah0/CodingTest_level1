#include <stdio.h>

int main(void) {
    int a;
    int b;
    scanf("%d %d", &a, &b);
    for(int i = 0; i < b; i++){
        for(int j = 0; j < a; j++){
            printf("%c",'*');
        }
        printf("\n");
    }
    //printf("%d", a + b);
    return 0;
}