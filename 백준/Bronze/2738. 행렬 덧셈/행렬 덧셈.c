#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int a[100][100],b[100][100],i,j,N,M;
	scanf("%d %d",&N,&M);
	for (i = 0; i < N; i++) {
		for (j = 0; j < M; j++) {
			scanf("%d", &a[i][j]);
		}
	}
	for (i = 0; i < N; i++) {
		for (j = 0; j < M; j++) {
			scanf("%d", &b[i][j]);
		}
	}
	for (i = 0; i < N; i++) {
		for (j = 0; j < M; j++) {
			printf("%d ", a[i][j]+b[i][j]);
		}
		printf("\n");
	}
	return 0;
}