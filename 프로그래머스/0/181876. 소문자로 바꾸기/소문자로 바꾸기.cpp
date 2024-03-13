#include <string>
#include <vector>

using namespace std;

string solution(string myString) {
    for(int i = 0;i<myString.length();i++) {
        if(myString[i]<97||myString[i]>122) myString[i] +=32;
    }
    return myString;
}