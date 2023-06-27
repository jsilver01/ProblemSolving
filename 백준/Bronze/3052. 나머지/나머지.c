#include <stdio.h>

int main(){
    int a;
    int remain[11];
    int result = 0;

    for(int i = 0; i < 10; i++){
        scanf("%d",&a);
        remain[i] = a % 42;
    } 

    for(int j = 0; j < 10; j++){
        int same = 0; 
        for(int k = j+1; k < 10 ; k++){
            if(remain[j]==remain[k]){
                same++;
            }
        }
        if(same == 0){
            result++;
        }
    }
    printf("%d", result);
    return 0;
}