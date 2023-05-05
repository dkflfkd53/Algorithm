#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int T, R,cnt;
	char S[21];
	scanf("%d", &T);
	for (int i = 0; i < T; i++) {
		scanf("%d %s", &R,S);
		cnt = 0;
		while (S[cnt]!='\0'){
			for (int j = 0; j < R; j++) {
				printf("%c",S[cnt]);
			}
			cnt++;
		}
		printf("\n");
	}
	return 0;
}