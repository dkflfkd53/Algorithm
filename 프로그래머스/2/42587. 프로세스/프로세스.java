// 1. piorities 요쇼를 포함하는 큐(q1)와 1~n까지를 포함하는 큐(q2)를 만든다.
// 2. q1에서 첫번째 요소를 꺼낸다. priorities를 돌며 더 큰 수가 있는지 찾는다
//  2-1. 없다면 q2에서 첫번째 요소를 꺼낸뒤 count를 하나 증가시킨다.
//  2-2. 있다면 꺼낸 요소를 다시 큐의 맨 뒤에 넣은뒤 2번으로 돌아간다.
// 3. q2에서 꺼낸 요소와 location이 같은지 비교한다.
//  3-1. 같다면 count를 return한다.
//  3-2. 다르다면 2번으로 돌아간다.

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            q1.add(priorities[i]);
            q2.add(i);
        }
        
        while(!q1.isEmpty()) {
            int a = q1.poll();
            int b = q2.poll();
            boolean c = false;
            
            for(int priority : q1) {
                if(priority > a) {
                    c = true;
                    break;
                }
            }
            
            if(c) {
                q1.add(a);
                q2.add(b);
            } else {
                count++;
                if(b == location) {
                    break;
                }
            }
        }
        return count;
    }
}
