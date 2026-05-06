class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int share = n/slice;
        if(n%slice !=0){
            share+=1;
        }
        
        return share;
    }
}