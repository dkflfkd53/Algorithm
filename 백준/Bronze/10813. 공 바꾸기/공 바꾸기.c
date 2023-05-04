#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int N, M,i,j,c=0;
	int a[101];
	scanf("%d %d", &N, &M);
	for (int o = 1; o <= N; o++) a[o] = o;

	for (int p = 1; p <= M; p++) {
		scanf("%d %d", &i, &j);
		c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
	for (int t = 1; t <= N; t++) {
		printf("%d ", a[t]);
	}
	return 0;
}