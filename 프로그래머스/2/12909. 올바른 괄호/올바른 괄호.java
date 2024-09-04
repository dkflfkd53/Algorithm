import java.util.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        if(s.length()%2==1) return false;
        
        Stack<String> stack = new Stack<>();
        
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == '(') stack.push(String.valueOf(s));
            else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        return (stack.isEmpty()) ? true : false;
    }
}