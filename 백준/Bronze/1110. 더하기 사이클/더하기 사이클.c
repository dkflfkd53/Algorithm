#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int a,b,cnt=0;
	scanf("%d", &a);
	b = a;
	do{
		a = (a / 10 + a % 10) % 10 + (a % 10) * 10;
		cnt++;
	} while (a != b);
	printf("%d", cnt);

	return 0;
}
