import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer= n-lost.length;
        boolean[] solve = new boolean[lost.length];
        boolean[] isUsed = new boolean[reserve.length];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여분있는애가 잃어버린경우 먼저 탐색
        for(int i=0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i]==reserve[j] && !isUsed[j]){
                    isUsed[j]=true;
                    solve[i]=true;
                    answer++;
                }
            }
        }
        
        // 왼쪽부터 탐색
        for(int i = 0; i < lost.length; i++){
            if(!solve[i]){
                for(int j = 0; j < reserve.length; j++){
                    if(!isUsed[j]){
                        if(lost[i]-1 == reserve[j]){
                            isUsed[j]=true;
                            solve[i]=true;
                            answer++;
                            break;
                        }else if(lost[i]+1 == reserve[j]){
                            isUsed[j]=true;
                            solve[i]=true;
                            answer++;
                            break;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}