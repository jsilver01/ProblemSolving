class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].contains("Kim")){
                return answer += i +"에 있다";
            }
        }
        return answer;
    }
}