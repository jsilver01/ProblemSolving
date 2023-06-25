#include <stdio.h>
#include <string.h>

int main(){
    int num; //입력받을 문자열 개수
    int R; //반복 횟수
    char string[100]; //문자열 저장

    scanf("%d", &num);

    for(int i = 0; i < num; i++){
        scanf("%d %s", &R, string);
        for(int j = 0; j < strlen(string); j++){
            for(int k = 0;k < R; k++){
                printf("%c",string[j]);
            }
        }
        printf("\n");
    }
}