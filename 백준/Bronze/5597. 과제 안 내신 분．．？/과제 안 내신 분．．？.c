#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int a[31]={0}, b;
	for(int i=1;i<=28;i++){
		scanf("%d", &b);
		a[b] = 1;
	}
	for (int i = 1; i <= 30 ; i++) {
		if (a[i] == 0)printf("%d\n", i);
	}
	return 0;
}