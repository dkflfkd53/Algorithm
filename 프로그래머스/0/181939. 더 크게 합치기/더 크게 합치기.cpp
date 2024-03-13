#include <string>
#include <iostream>
#include <vector>

using namespace std;

int solution(int a, int b) {
    
    string a_str = to_string(a);
    string b_str = to_string(b);
    
    string a_b = a_str + b_str;
    string b_a = b_str + a_str;
    
    if(a_b>b_a) return stoi(a_b);
    else return stoi(b_a);
}