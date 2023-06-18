#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int A, B, C,total,count=0;
	scanf("%d %d %d", &A, &B, &C);
	for (int i = 0; i < 10; i++) {
		total = A * B * C;
		count = 0;
		while (total>0) {
			if (total % 10 == i)count++;
			total /= 10;
		}
		printf("%d\n", count);
	}
	return 0;
}

