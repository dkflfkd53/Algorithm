#include<stdio.h>
#pragma warning(disable:4996)
int main() {
	float N,grade[1000],M=0,total=0;
	scanf("%f", &N);
	for (int i = 0; i < N; i++) {
		scanf("%f", &grade[i]);
		if (M <= grade[i])M = grade[i];
	}
	for (int i = 0; i < N; i++) {
		grade[i]=grade[i] / M * 100;
		total += grade[i];
	}
	printf("%f",total/N);
}