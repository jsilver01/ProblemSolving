import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            // 100 까지 남은 진도 
            int remains = 100-progresses[i];
            int days = 0; 
            if(remains%speeds[i] != 0){
                // 70 % 30 같은 경우
                days = remains/speeds[i] + 1;
            } else{
                days = remains/speeds[i];
            }
            queue.add(days);
        }
        
        // 큐에서 하나씩 꺼내면서 꺼낸 수 보다 작으면 다시 pop()
        while(!queue.isEmpty()){
            int firstJob = queue.poll();
            int size = queue.size();
            int lasting = 1;
            for(int i = 0; i < size; i++){
                if(firstJob >= queue.peek()){
                    // 선행되어야하는 작업이 더 긴 시간이 걸리니까 뒤에 작업들은 대기해야함
                    queue.poll();
                    lasting++;
                }
            }
            list.add(lasting);
        }
        
        answer = new int[list.size()];
        // 정답 배열에 옮겨담기
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}