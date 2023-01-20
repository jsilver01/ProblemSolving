#include <stdio.h>
int main() {
	int a, b, x, i, t;
	scanf("%d", &t);

	for (int x = 0; x < t; x++) {
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
	}

	return 0;
}