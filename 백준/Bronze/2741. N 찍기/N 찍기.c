#include <stdio.h>

int main(){
    int N; //입력받을 자연수 N
    scanf("%d", &N);

    for(int i = 1; i <= N; i++){
        if(i==N){
            printf("%d", i);
        }
        else{
            printf("%d\n", i);
        }
    }
    return 0;
}