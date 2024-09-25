// 1. 큐에 progresses와 speeds를 모두 넣는다.
// 2. 무한 반복문을 돌려서 progresses 값을 증가시킨다.
// 3. 맨 앞에 값이 100이 되면 progresses와 speeds 두 배열의 값을 뺀다.
// 4. answer 변수의 값을 증가 시킨다.
// 5. answer 변수의 값을 배열의 추가한다.
// 6. 배열의 더 이상 값이 남아있지 않으면 반복문을 멈추고 answer값을 넣은 배열을 return한다.

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            q1.add(progresses[i]);
            q2.add(speeds[i]);
        }
        
        while (!q1.isEmpty()) {
            // 하루가 지날 때마다 작업을 진행함
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                int progress = q1.poll();
                int speed = q2.poll();
                q1.add(progress + speed);
                q2.add(speed);
            }

            // 완료된 작업 체크
            int count = 0;
            while (!q1.isEmpty() && q1.peek() >= 100) {
                q1.poll();
                q2.poll();
                count++;
            }
            
            if (count > 0) {
                answerList.add(count); // 배포된 작업 수 저장
            }
        }
        
        // List를 배열로 변환하여 반환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}