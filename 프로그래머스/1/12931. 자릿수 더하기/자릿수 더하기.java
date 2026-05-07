import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int len = (String.valueOf(n)).length();
        for(int i = len; i>0;i--){
            if(i==1){
                answer += n;
            }else{
                answer += n/(int)(Math.pow(10,i-1));
                n = n%(int)(Math.pow(10,i-1));
            }
        }
        return answer;
    }
}