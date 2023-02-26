#include <stdio.h>

int main() {
	int T;//테스트케이스 개수
	scanf("%d", &T);
	char arr[1001];

	for (int i = 0; i < T; i++) {
		scanf("%s", arr);
		int len = strlen(arr);
		printf("%c%c\n", arr[0], arr[len - 1]);
	}
	return 0;
}