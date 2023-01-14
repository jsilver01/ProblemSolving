#include <stdio.h>
int main() {
	int a, b;
	scanf("%d", &a);
	scanf("%d", &b);
	int three, four, five, six;
	three = a * (b % 10);
	four = a * ((b / 10) % 10);
	five = a * (b / 100);
	six = three + (four * 10) + (five * 100);
	printf("%d\n",three);
	printf("%d\n",four);
	printf("%d\n",five );
	printf("%d", six);
	return 0;
}