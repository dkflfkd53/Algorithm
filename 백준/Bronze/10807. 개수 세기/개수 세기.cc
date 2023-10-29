#include<stdio.h>
#pragma warning(disable:4996)

int main() {

	int a[100];
	int count=0;
	int n, v;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d ", &a[i]);
	}
	scanf("%d", &v);
	for (int o = 0; o < n; o++) {
		if (a[o] == v)count++;
	}
	printf("%d", count);
	return 0;
}
