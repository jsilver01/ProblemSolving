class Solution {
    public int solution(int n) {
        
        int share = n/7;
        if(n%7!=0){
            share++;
        }
        
        return share;
    }
}