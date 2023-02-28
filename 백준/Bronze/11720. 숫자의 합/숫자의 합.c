#include <stdio.h>
int main() {
	int n, num;//숫자의 개수, 입력받은 수
	int sum = 0;//합계

	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%1d", &num);
		sum += num;
	}
	printf("%d", sum);
	return 0;
}