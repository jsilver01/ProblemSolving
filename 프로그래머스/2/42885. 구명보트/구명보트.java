import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        // 무거운 사람 기준으로 정렬
        Arrays.sort(people);
        
        int idx = 0;
        for(int i = people.length-1; i >= idx; i--){
            if(people[idx]+people[i] <= limit){
                answer++;
                idx++;
            }else{
                answer++;
            }
        }
        return answer;
    }
}