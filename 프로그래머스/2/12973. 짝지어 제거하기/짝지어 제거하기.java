import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){
                // 스택안에 값이 있고 그 값이 현재 문자랑 같은 경우 (제거)
                stack.pop();
            } else{
                stack.push(c);
            }
        }
        
        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}