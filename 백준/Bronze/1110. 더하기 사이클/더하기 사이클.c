#include <stdio.h>
int main() {
	int n;
	int a, b, c;
	int sum;
	int result;
	int count=1;
	scanf("%d", &n);
	result = n;
	while (1) {
		a = n / 10;
		b = n % 10;
		sum = a + b;
		c = sum % 10;
		n = (b * 10) + c;
		if (n == result) {
			printf("%d", count);
			break;
		}
		count++;
	}
	return 0;
}