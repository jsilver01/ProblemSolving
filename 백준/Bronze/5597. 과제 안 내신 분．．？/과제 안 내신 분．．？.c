#include <stdio.h>
int main() {
	int num;
	int student[31] = { 0 };
	for (int i = 0; i < 28; i++) {
		scanf("%d", &num);
		student[num] = num;
	}

	for (int j = 1; j < 31; j++) {
		if (student[j] == 0) {
			printf("%d\n", j);
		}
	}
	return 0;
}