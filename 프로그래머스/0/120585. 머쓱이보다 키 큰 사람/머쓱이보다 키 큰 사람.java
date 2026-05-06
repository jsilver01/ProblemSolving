import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        int arrLength = array.length;
        int reference;
        
        for(int i = 0; i < arrLength; i++){
            reference = array[i];
            if(reference > height){
                answer = arrLength-i;
                return answer;
            }
        }
        return answer;
    }
}