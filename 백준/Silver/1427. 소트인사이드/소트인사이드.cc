#include<stdio.h>
#include<algorithm>
#include<string.h> // strlen 함수 사용을 위한 헤더파일
#pragma warning(disable:4996)

bool comp2(const int& a, const int& b) {
    return a > b;
}

int main() {
    char char_arr[11];
    int arr[11];

    scanf("%s", char_arr); // 문자열 입력받기

    for (int i = 0; i < strlen(char_arr); i++) { // 배열 크기 대신 실제 문자열 길이로 반복
        arr[i] = char_arr[i] - '0'; // 숫자로 변환
    }

    std::sort(arr, arr + strlen(char_arr), comp2);

    for (int i = 0; i < strlen(char_arr); i++) {
        printf("%d", arr[i]); // 값 출력하기
    }

    return 0;
}