#include<stdio.h>
#include<algorithm>
bool comp2(const int& a, const int& b) {
	return a > b;
}
int main() {
	int arr[1000];
	int a, b;
	scanf("%d %d", &a,&b);
	for (int i = 0; i < a; i++) {
		scanf("%d", &arr[i]);
	}
	std::sort(arr, arr + a, comp2);
	printf("%d", arr[b - 1]);
	return 0;
}