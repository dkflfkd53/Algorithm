//1. 주어진 배열 arr를 도는 반복문을 만든다
//2. 반복문에서 요소에 값을 answer배열에 추가하고 진적 요소와 겹치면 추가하지 않는다.
//3. answer 배열을 return 한다.

import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>(); 
        int a = -1;
        
        for(int i =0; i<arr.length; i++) {
            if(a!=arr[i]) answer.add(arr[i]);
            a = arr[i];
        }

        return answer;
    }
}