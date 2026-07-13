import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int pLen = prices.length;
        int[] answer = new int[pLen];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < pLen; i++){
            queue.add(prices[i]);
        }
        
        int idx = 0;
        int num;
        while(!queue.isEmpty()){
            int cnt = 1;
            num = queue.poll();
            for(int i = idx+1; i < pLen-1; i++){
                if(num <= prices[i]){
                    cnt++;
                }else{
                    break;
                }
            }
            if(idx==pLen-1){
                answer[idx] = 0;
            }else{
                answer[idx] = cnt;
                idx++;
            }
        }
        
        
        return answer;
    }
}