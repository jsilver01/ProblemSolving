import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        //공백을 만나면 다음 문자가 첫글자 + 첫글자 외에는 소문자
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch== ' '){
                first = true;
            }else{
                if(first){
                    ch = Character.toUpperCase(ch);
                    first= false;
                }else{
                    ch = Character.toLowerCase(ch);
                }
            }
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}