import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        Map<Integer, Integer> tgs = new HashMap<>();
        
        for(int num : tangerine) {
            tgs.put(num, tgs.getOrDefault(num, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(tgs.values());
        counts.sort(Collections.reverseOrder());
        
        int sum = 0;
        for(int num : counts){
            sum += num;
            if(k <= sum){
                break;
            }else{
                answer++;
            }
        }
        return answer;
    }
}