class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int garo = 0;
        int sero = 0;
        // 가운데만 노랑이기 때문에 
        for(int i = 1; i <= yellow; i++){
            if(yellow%i==0){
                if(i+2 >= yellow/i +2){
                    garo = i +2;
                    sero = yellow / i + 2;
                }else{
                    garo = yellow / i + 2;
                    sero = i +2;
                }
                
                if((garo*sero - yellow)==brown){
                    answer[0]=garo;
                    answer[1]=sero;
                }
            }
        }
        return answer;
    }
}