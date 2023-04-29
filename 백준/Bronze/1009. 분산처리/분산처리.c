#include<stdio.h>
#pragma warning(disable)
int main() {

	int T, a, b,c=0;
	scanf("%d", &T);
	for (int i = 0; i < T; i++) {
		scanf("%d %d", &a, &b);
		c = a;
		for (int j = 1; j < b; j++) {
			a = a*c%10;
		
		}
		if (a % 10 == 0)printf("10\n");
		else printf("%d\n", a%10);
	}

	return 0;
}