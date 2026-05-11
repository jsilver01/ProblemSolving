class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int xLen = String.valueOf(x).length();
        int realX = x;
        for(int i = xLen; i > 0; i--){
            if(i==1){
                sum+=x;
            }else{
                sum+= x/Math.pow(10,i-1);
                x = (int)(x % Math.pow(10,i-1));
            }
        }
        
        if(realX%sum==0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}