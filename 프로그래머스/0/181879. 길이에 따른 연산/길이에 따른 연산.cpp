#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer1 = 0, answer2 = 1, i;
    
    if(num_list.size()>=11) {
        for(i = 0;i<num_list.size();i++) answer1+=num_list[i];
        return answer1;
    }
    else {
        for(i = 0;i<num_list.size();i++) answer2*=num_list[i];
        return answer2;
    }
}