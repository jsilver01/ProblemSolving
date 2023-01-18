#include <stdio.h>
int main() {
	int h, m;//현재시각
	int nm;//요리하는데 필요한 시간
	int a;//현재시각+요리하는데 필요한 시간
	int plush;//더해질 시간
	int plusm;//더해질 분

	scanf("%d %d", &h, &m);
	scanf("%d", &nm);

	a = m + nm;
	if (a >= 60) {
		plush = h + (a / 60);
		plusm = a % 60;
		if (plush>=24) {
			printf("%d %d", plush-24, plusm);
		}
		else {
			printf("%d %d", plush, plusm);
		}
	}
	else {
		printf("%d %d", h, a);
	}
	return 0;
}