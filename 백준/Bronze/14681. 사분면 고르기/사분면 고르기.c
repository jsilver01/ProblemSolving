#include <stdio.h>
int main() {
	int x;//x좌표
	int y;//y좌표

	scanf("%d", &x); //x좌표입력
	scanf("%d", &y); //y좌표입력

	if (x > 0 && y > 0) {//1사분면
		printf("1");
	}
	else if (x < 0 && y > 0) {//2사분면
		printf("2");
	}
	else if (x < 0 && y < 0) {//3사분면
		printf("3");
	}
	else {//4사분면
		printf("4");
	}
	return 0;
}