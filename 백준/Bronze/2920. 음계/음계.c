#include <stdio.h>

int main(){
    int a[7];
    scanf("%d %d %d %d %d %d %d %d", &a[0],&a[1],&a[2],&a[3],&a[4],&a[5],&a[6],&a[7]);
    int asc =0;
    int des =0;
    for(int i = 0; i < 7; i++){
        if(a[i]<a[i+1]){
            asc++;
        }
    }

    for(int j=0;j<7;j++){
        if(a[j]>a[j+1]){
            des++;
        }
    }

    if(asc==7){
        printf("ascending");
    }
    else if(des==7){
        printf("descending");
    }
    else{
        printf("mixed");
    }
    return 0;
}