#include<stdio.h>
#include<algorithm>
int main() {
	int arr[1000000];
	int a;
	scanf("%d", &a);
	for (int i = 0; i < a; i++) {
		scanf("%d", &arr[i]);
	}
	std::sort(arr, arr + a);
	for (int i = 0; i < a; i++) {
		printf("%d\n", arr[i]);
	}
	return 0;
}