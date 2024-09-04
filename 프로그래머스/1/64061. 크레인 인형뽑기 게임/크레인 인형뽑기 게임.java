import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<moves.length;i++) {
            int value = circuit(board, moves[i]);
            System.out.println(value);
            if(value == 0) continue;
            if(stack.isEmpty()) stack.push(value);
            else if(stack.peek() == value) {
                stack.pop();
                answer+=2;
            }
            else {
                stack.push(value);
            }
        }
        return answer;
    }
    
    public int circuit(int[][] board, int n) {
        for(int i=0;i<board.length;i++) {
            if(board[i][n-1] != 0) {
                int a = board[i][n-1];
                board[i][n-1] = 0;
                return a;
            }
        }
        return 0;
    }
}
