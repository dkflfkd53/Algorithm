// 1. 문자열의 값들을 스택에 추가
// 2. 추가하는 과정에서 )가 들어올때 (가 존재하면 2괄호 모두 삭제
// 3. 스택이 비어있으면 true를 반환 값이 남아있으면 false를 반환
import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if(currentChar == '(') {
                stack.push(currentChar);
            } 
            else if(currentChar == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else {
                stack.push(currentChar);
            }
        }
        
        return stack.isEmpty();
    }
}