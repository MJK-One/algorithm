// https://school.programmers.co.kr/learn/courses/30/lessons/12909
// 스택/큐 올바른 괄호
import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stackChar = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(') {
                stackChar.push(s.charAt(i));
            } else {
                if(stackChar.isEmpty()) {
                    answer = false;
                    break;
                } 
                stackChar.pop();
            }
        }
        if(stackChar.isEmpty() == false) {
            answer = false;
        }
        
        return answer;
    }
}
