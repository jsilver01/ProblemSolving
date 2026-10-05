import java.util.*; 

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            // i 만큼 회전한 문자열
            String rotated = s.substring(i) + s.substring(0, i);
            // 괄호가 올바른지 검사
            if(isValid(rotated)){
                answer++;
            } 
        }
        
        return answer;
    }
    
    private boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        
        for(char c : str.toCharArray()) {
            if(c == '('|| c == '{'||c == '['){
                // 여는 괄호
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                
                // 닫는 괄호
                char output = stack.pop();
                if(c==')' && output != '('){
                    return false;
                }
                if(c=='}' && output != '{'){
                    return false;
                }
                if(c==']' && output != '['){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}