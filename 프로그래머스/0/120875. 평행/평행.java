class Solution {
    public int solution(int[][] dots) {
        
        if(getGradient(dots[0], dots[1])==getGradient(dots[2],dots[3])){
            return 1;
        }
        
        if(getGradient(dots[0], dots[2])==getGradient(dots[1],dots[3])){
            return 1;
        }
        
        if(getGradient(dots[0], dots[3])==getGradient(dots[1],dots[2])){
            return 1;
        }
        
        return 0;
    }
    
    private double getGradient(int[] dot1, int[] dot2){
        //기울기 구하기
        int x1 = dot1[0];
        int y1 = dot1[1];
        
        int x2 = dot2[0];
        int y2 = dot2[1];
        
        double run = x1 - x2; //x축 증가량
        double rise = y1 - y2; //y축 증가량
        
        double gradient = rise / run;
        
        return gradient;
    }
}