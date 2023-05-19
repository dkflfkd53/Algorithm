#include <stdio.h>
#pragma  warning(disable:4996)
int main() {
	int a[10][10], i, j, top = 0, top_i = 0, top_j = 0;

	for (i = 1; i <= 9; i++) {
		for (j = 1; j <= 9; j++) {
			scanf("%d", &a[i][j]);
			if (a[i][j] >= top) {
				top = a[i][j];
				top_i = i;
				top_j = j;
			}
		}
	}
	printf("%d\n%d %d", top, top_i, top_j);
	return 0;
}