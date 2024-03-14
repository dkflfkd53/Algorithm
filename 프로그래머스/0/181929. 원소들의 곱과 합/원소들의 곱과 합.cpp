#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    
    int answer1 = 0, answer2=1;
    
    for(int i = 0;i<num_list.size();i++) {
        answer1+=num_list[i];
        answer2*=num_list[i];
    }
    
    if(answer1*answer1>answer2) return 1;
    else return 0;
}