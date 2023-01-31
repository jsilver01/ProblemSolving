#include <stdio.h>
int main() {
	int a[100];
	int k;
	for (int i = 0; i < 9; i++) {
		scanf("%d", &a[i]);
	}
	int max = a[0];
	for (int j = 1; j < 9; j++) {
		if (a[j] > max) {
			max = a[j];
			k = j + 1;
		}
	}
	if (max == a[0]) {
		printf("%d\n%d", max, 1);
	}
	else {
		printf("%d\n%d", max, k);
	}
	return 0;
}