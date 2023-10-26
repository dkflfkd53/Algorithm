#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	long long int a, b=1;
	scanf("%lld", &a);

	for (long long int i = 1;i <= a;i++) {
		b*=i;
	}

	printf("%lld", b);

	return 0;
}