class Solution {
    public int solution(int[] numbers) {
        boolean[] answer = new boolean[10];
        int result = 0;
        
        for(int i = 0; i < numbers.length; i++){
            answer[numbers[i]]=true;
        }
        
        for(int i = 0; i<10;i++){
            if(!answer[i]){
                result += i;
            }
        }
        
        return result;
    }
}