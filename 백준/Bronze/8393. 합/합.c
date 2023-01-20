#include <stdio.h>
int main() {
	int n, sum;
	scanf("%d", &n);
	sum = n;
	for (int i = n; i >0; i--) {
		sum = sum + (i-1);
	}
	printf("%d", sum);
	return 0;
}