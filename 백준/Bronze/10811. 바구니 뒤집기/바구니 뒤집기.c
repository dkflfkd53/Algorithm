#include<stdio.h>
#pragma warning(disable:4996)
int main() {

	int N, M,i,j;
	int a[101],b[101],c=0,d=0;
	scanf("%d %d", &N, &M);
	for (int o = 1; o <= N; o++) {
		a[o] = o;
		b[o] = o;
	}
	for (int o = 0; o < M; o++) {
		scanf("%d %d", &i, &j);
		c = j;
		for (int t = i; t <= j; t++) {
			d = a[t];
			a[t] = b[c];
			b[c] = d;
			c--;
		}
	}
	for (int y = 1; y <= N; y++) printf("%d ",a[y]); 
	return 0;
}