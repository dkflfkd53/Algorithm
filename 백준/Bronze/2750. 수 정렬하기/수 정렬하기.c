#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int a, b[1000], i, j, temp;

	scanf("%d", &a);

	for (i = 0; i < a; i++) {
		scanf("%d", &b[i]);
	}
	for (i = 0; i < a - 1; i++) {
		for (j = 0; j < a - 1; j++) {
			if (b[j] > b[j + 1]) {
				temp = b[j];
				b[j] = b[j + 1];
				b[j + 1] = temp;
			}
		}
	}

	for (i = 0; i < a; i++) {
		printf("%d\n", b[i]);
	}
	return 0;
}