#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int a,b[1000]={0}, cnt = 0;
	for (int i = 0; i < 10; i++) {
		scanf("%d", &a);
		a=a%42;
		b[a] = 1;
	}
	for (int i = 0; i < 1000; i++)
	 {
		if (b[i] == 1)cnt++;
	}
	printf("%d", cnt);	
	return 0;
}