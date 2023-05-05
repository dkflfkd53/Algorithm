#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int T,cnt;
	char a[1000];
	scanf("%d", &T);
	for (int j = 0; j < T; j++) {
		scanf("%s", a);
		cnt = 0;
		while (a[cnt]!='\0')cnt++;
		printf("%c%c\n", a[0],a[cnt-1]);
	}
	return 0;
}