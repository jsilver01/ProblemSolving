import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] temp = commands[i];

            int first = temp[0]; //2
            int second = temp[1]; // 5
            int third = temp[2]; //3
            
            List<Integer> list = new ArrayList<>();
            
            for(int j = first-1; j < second; j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            answer[i] = list.get(third-1);
        }
        return answer;
    }
}