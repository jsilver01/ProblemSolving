class Solution {
    public int solution(int num) {
        int answer = -1;
        long n = num;
        
        if(num==1) return 0;
        
        int cnt = 0;
        while(cnt<500){
            if(n == 1) return cnt;
            if(n%2==0){
                n /= 2;
            }else{
                n=n*3 +1;
            }
            cnt++;
        }
        
        return answer;
    }
}