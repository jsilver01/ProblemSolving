#include <stdio.h>
#include <string.h>

int main(){
    char str[10000000];
    scanf("%[^\n]", str);

    int num = 0;
    
    for(int i = 0; i < strlen(str); i++){
        if(str[i]!=' '){
            num++;
        }
        while(str[i]!=' '){
            i++;
        }
    }
    printf("%d",num);
    return 0;
}