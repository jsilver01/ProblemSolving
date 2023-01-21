#include <stdio.h>
int main() {
	int a, n, p, c;
	int add;
	int sum = 0;
	scanf("%d", &a);
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d %d", &p, &c);
		add = p * c;
		sum = sum + add;
	}
	if (sum == a) {
		printf("Yes");
	}
	else {
		printf("No");
	}
	return 0;
}