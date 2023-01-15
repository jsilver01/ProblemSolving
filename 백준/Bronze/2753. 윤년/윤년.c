#include <stdio.h>
int main() {
	int a; //입력받는 연도
	scanf("%d", &a);
    
	if (a % 4 == 0 && a % 100 != 0) {
		printf("1"); //4의배수이며 100의 배수는 아닐때
	}
	else if (a % 400 == 0) {
		printf("1"); //400의배수일때
	}
	else {
		printf("0"); //윤년이 아닐때
	}
	return 0;
}