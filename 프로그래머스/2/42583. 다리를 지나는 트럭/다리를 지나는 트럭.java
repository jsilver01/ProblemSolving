import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        // 큐의 길이 만들기
        for(int i = 0; i < bridge_length; i++){
            bridge.add(0);
        }
        
        int twIdx = 0;
        int currentWeight = 0;
        while(currentWeight > 0 || twIdx < truck_weights.length){
            answer++;
            currentWeight -= bridge.poll();
            if(twIdx < truck_weights.length){
                // 다리에 올릴 트럭이 있는 경우
                if(currentWeight + truck_weights[twIdx] <= weight){
                    // 다리에 올릴 수 있는 경우
                    currentWeight += truck_weights[twIdx];
                    bridge.add(truck_weights[twIdx]);
                    twIdx++;
                }else{
                    bridge.add(0);
                }
            } else{
                // 마지막 트럭이 나오길 기다리는 경우
                bridge.add(0);
            }
        }
        return answer;
    }
}