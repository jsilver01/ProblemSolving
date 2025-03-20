import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int size = 0;
        int[][] dp = new int[park.length][park[0].length];
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length; j++){
                if(park[i][j].equals("-1")){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]= Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;
                    }
                    size = Math.max(size, dp[i][j]);
                }
            }
        }
        Arrays.sort(mats);
        for(int i = 0; i < mats.length; i++){
            int a = size - mats[i];
            if(a<0){
                return answer;
            }else{
                answer = mats[i];
            }
        }
        return answer;
    }
}