import java.util.*;

class Solution {
    public int[] solution(long n) {
        
//         StringBuffer sb = new StringBuffer(String.valueOf(n));
//         String reversedStr = sb.reverse().toString();
        
//         int[] answer = new int[reversedStr.length()];
//         for(int i = 0; i < reversedStr.length(); i++){
//             answer[i] = Integer.parseInt(String.valueOf(reversedStr.charAt(i)));
           
//         }
//         return answer;
        
        List<Integer> list = new ArrayList<>();
        
        while(n>0){
            list.add((int)(n%10));
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}