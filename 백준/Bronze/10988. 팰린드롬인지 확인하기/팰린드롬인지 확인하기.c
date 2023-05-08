#include<stdio.h>
#pragma warning(disable:4996)
int main(void) {

	char a[10000] = { 0 }, b[10000] = { 0 };
	int cnt = 0,cnt2=0, total = 0;
	scanf("%s", a);
	while (a[cnt]!='\0'){
		b[cnt] = a[cnt];
		cnt++;
		
	}
	if (cnt == 1) {
		printf("1"); return 0;
	}
	cnt2 = cnt - 1;
	for (int j = 0; a[j] != '\0'; j++) {
		cnt--;
		a[j] = b[cnt];
		if (a[j] == b[j])total++;
		else {
			printf("0");
			return 0;
		}
	}
	printf("%d", total/cnt2);
	return 0;
}