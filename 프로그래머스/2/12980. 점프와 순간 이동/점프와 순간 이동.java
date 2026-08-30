import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 1){
            if(n%2 ==0){
                //짝수
                n /= 2;
            } else {
                // 홀수
                n -= 1;
                ans++;
            }
        }
        ans += 1;
        return ans;
    }
}