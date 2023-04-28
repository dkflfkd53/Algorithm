#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	int s;
	scanf("%d", &s);

	for (int a = 1; a <= s; a++) {
		for (int b = 1; b < a; b++) {
			printf(" ");
		}
		for (int c = 1; c <= s; c++) {
			if (c == 1 || c >= s)  printf("*");
			else if (a == 1)printf("*");
			else printf(" ");
		}
		for (int d = s; d > a; d--) {
				printf(" ");
		}
		for (int e = s; e - 1 > a; e--) {
			printf(" ");
		}
		for (int f = 1; f <= s; f++) {
			if (a >= s&&f==1)continue;
			else if (f == 1 || f >= s)printf("*");
			else if (a == 1)printf("*");
			else printf(" ");
		}
		
		if (a >= s)break;
		printf("\n");
	}
	for (int g = 1; g <= s; g++) {
		for (int h = s; h > g; h--) {
			if (g == 1)continue;
			printf(" ");   
		}
		for (int i = 1; i <= s; i++) {
			if (g == 1)continue;
			else if (i == 1 || i >= s)printf("*");
			else if (g >=s )printf("*");
			else printf(" ");
		}
		for (int j = 2; j+1 < g * 2; j++) {
			printf(" ");
		}
		for (int k = 1; k <= s; k++) {
			if (g == 1)continue;
			else if (k == 1 || k >= s)printf("*");
			else if (g >=s)printf("*");
			else printf(" ");
			
		}
		printf("\n");
	}
	return 0;
}