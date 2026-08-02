import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int num = 0;
        Set<String> wordsSet = new HashSet<>();
            
        for(int i = 0; i < words.length; i++){
            if(i!=0){
                String before = words[i-1];
                String now = words[i];
                
                if(before.charAt(before.length()-1) != now.charAt(0)){
                    answer[0] = (num+1) % n == 0 ? n : (num+1) % n;
                    answer[1] = (num / n) + 1;
                    break;
                }
            }
            
            if(wordsSet.contains(words[i])){
                answer[0] = (num+1) % n == 0 ? n : (num+1) % n;
                answer[1] = (num / n) + 1;
                break;
            } else{
                wordsSet.add(words[i]);
                num++;
            }
        }
        return answer;
    }
}