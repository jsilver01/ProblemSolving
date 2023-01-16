#include <stdio.h>
int main() {
	int h, m; //시간, 분
	scanf("%d %d", &h, &m);
    
	if (h > 0) { 
		if (m >= 45) {//h가 0보다 크고 m이 45보다 클 때
			m = m - 45;
			printf("%d %d", h, m);
		}
		else { //h가 0보다 크고 m이 45보다 작아서 m-45가 음수가 될 때
			h = h - 1;
			m = m + 15;
			printf("%d %d", h, m);
		}
	}
	else if (h == 0) {
		if (m >= 45) {//h가 0이고 m이 45보다 클 때
			m = m - 45;
			printf("%d %d", h, m);
		}
		else {//h가 0이고 m-45가 음수가 될 때
			h = 23;
			m = m + 15;
			printf("%d %d", h, m);
		}
	}
	
	return 0;
}