class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder();
        int step = 0;
        int removeZero = 0;
        
        while(!s.equals("1")){
            sb.setLength(0); // 비우기
            // 0 제거
            for(char c : s.toCharArray()){
                if(c!='0'){
                    sb.append(c);
                }else{
                    removeZero++;
                }
            }
            int decimalNumber = sb.length();
            sb.setLength(0); // 비우기
            // 2진 변환하기
            while(decimalNumber/2!=0){
                sb.insert(0,decimalNumber%2);
                decimalNumber /= 2;
            }
            sb.insert(0,decimalNumber);
            s = sb.toString();
            step++;
        }
        answer[0] = step;
        answer[1] = removeZero;
        return answer;
    }
}