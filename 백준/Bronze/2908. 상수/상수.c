#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	char a[4], b[4],c[4], d[4], cnt1 = 0, cnt2 = 0, t1 = 2, t2 = 2;
	scanf("%s %s", a, b);
	for (int i = 0; i < 3; i++) {
		c[i] = a[i]; d[i] = b[i];
	}
	while (a[cnt1]!='\0'){
		a[cnt1] = c[t1];
		cnt1++; t1--;
	}
	while (b[cnt2] != '\0') {
		b[cnt2] = d[t2];
		cnt2++; t2--;
	}
	if (a[0] > b[0])printf("%s", a);
	else if (a[0] < b[0]) printf("%s", b);
	else if (a[1] > b[1])printf("%s", a);
	else if (a[1] < b[1])printf("%s", b);
	else if (a[2] > b[2])printf("%s", a);
	else if (a[2] < b[2])printf("%s", b);
	return 0;
}