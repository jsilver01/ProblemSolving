import java.util.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int cnt = st.countTokens();

        int[] arr = new int [cnt];
       
        for(int i = 0; i < cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min= arr[0];
        int max= arr[0];
        
        for(int i = 1; i < cnt; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        
        String result = String.valueOf(min)+" "+String.valueOf(max);
        return result;
    }
}