import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = name.length()-1;
        
        // 알파벳 결정하는데 필요한 조이스틱 이동 횟수
        for(int i = 0; i < len; i++){
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            
            int index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < len && name.charAt(index) == 'A'){
                index++;
            }
            
            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + len - index);
            move = Math.min(move, (len - index) * 2 + i);
        }
        
        return answer + move;
    }
}