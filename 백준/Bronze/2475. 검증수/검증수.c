#include <stdio.h>

int main(){
    int a[4]={};
    int result;
    scanf("%d %d %d %d %d",&a[0],&a[1],&a[2],&a[3],&a[4]);

    for(int i = 0; i < 5; i++){
        result += a[i] * a[i];
    }
    result = result % 10;
    printf("%d" ,result);
    return 0;
}