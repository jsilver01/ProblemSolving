#include <stdio.h>
int main() {
	int n;
	scanf("%d", &n);
	int a[n];

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	int max = a[0];
	int min = a[0];

	for (int j = 0; j < n; j++) {
		if (a[j] > max) {
			max = a[j];
		}
		if (a[j] < min) {
			min = a[j];
		}
	}

	printf("%d %d", min, max);

	return 0;
}