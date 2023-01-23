#include <stdio.h>
int main() {
	int t;//케이스 개수 T
	int a[100], b[100];//A,B
	scanf("%d", &t);
	for (int i = 0; i < t; i++) {
		scanf("%d %d", &a[i], &b[i]);
	}
	for (int j = 0; j < t; j++) {
		printf("Case #%d: %d + %d = %d\n", j + 1, a[j], b[j],a[j]+b[j]);
	}
	return 0;   
}