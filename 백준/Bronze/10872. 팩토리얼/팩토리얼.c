#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int a,total=1,j=0;
	scanf("%d", &a);
	for (int i = 1; i <= a; i++) {
		j++;
		total = total * j;
	}
	printf("%d", total);
	return 0;
}