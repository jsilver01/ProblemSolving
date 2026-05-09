import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] str = String.valueOf(n).toCharArray();
        Arrays.sort(str);
        
        StringBuffer sb = new StringBuffer(new String(str));
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}