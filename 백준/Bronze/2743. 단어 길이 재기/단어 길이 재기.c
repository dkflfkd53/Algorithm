#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	char a[101],cnt=0;
	scanf("%s", a);
	while (a[cnt]!='\0'){
		cnt++;
	}
	printf("%d", cnt);
	return 0;
}