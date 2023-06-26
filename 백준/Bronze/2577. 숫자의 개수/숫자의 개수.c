#include <stdio.h>

int main(){
    int a, b, c;
    int arr[10]={0,};

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    int mul = a * b * c;
    int num;

    while ( mul > 0 ){
        num = mul % 10;
        arr[num]++;
        mul /= 10;
    }

    for(int i = 0; i < 10; i++){
        printf("%d\n", arr[i]);
    }
    
    return 0;
}