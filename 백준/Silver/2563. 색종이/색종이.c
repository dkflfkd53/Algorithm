#include <stdio.h>
#pragma warning(disable:4996)
int main() {
	
	int a[100][100]={0}, b, i, j, o, x, y, total = 0;
	scanf("%d", &b);

	for (i = 0; i < b; i++) {
		scanf("%d %d", &x, &y);
		for (j = x; j < x + 10; j++) {
			for (o = y; o < y + 10; o++) {
				a[j][o] = 1;
			}
		}
	}

	for (i = 0; i < 100; i++) {
		for (j = 0; j < 100; j++) {
			if (a[i][j] == 1)total++;
		}
	}
	printf("%d", total);
	return 0;
}
