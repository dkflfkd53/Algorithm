#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    string A = to_string(a);
    string B = to_string(b);
    int A_B = stoi(A + B);
    if(A_B>a*b*2) return A_B;
    else return a*b*2;
}