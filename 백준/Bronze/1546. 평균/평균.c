#include <stdio.h>

int main() {
	int n;//시험 본 과목의 개수
	scanf("%d", &n);

	int score[1001];//시험본 점수 입력받기
	for (int i = 0; i < n; i++) {
		scanf("%d", &score[i]);
	}

	int max;//최대값 찾기
	for (int j = 0; j < n; j++) {
		if (j == 0) {
			max = score[j];
		}
		else {
			if (max < score[j]) {
				max = score[j];
			}
		}
	}
	double sum = 0;
	for (int k = 0; k < n; k++) {
		sum += (double)score[k] / max * 100;
	}
	printf("%lf", sum/n);
	return 0;
}