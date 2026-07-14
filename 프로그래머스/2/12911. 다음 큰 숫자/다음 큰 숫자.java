class Solution {
    public int solution(int n) {
        int answer = 0;
        int nowBits = Integer.bitCount(n);
        
        while(true){
            if(Integer.bitCount(n+1)==nowBits){
                answer = n+1;
                break;
            }else{
                n++;
            }
        }
        
        return answer;
    }
}