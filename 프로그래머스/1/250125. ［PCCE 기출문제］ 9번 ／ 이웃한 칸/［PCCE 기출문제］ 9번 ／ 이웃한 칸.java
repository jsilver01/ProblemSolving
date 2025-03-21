class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String now_color = board[h][w]; // 고른 칸 안에 있는 색깔
        
        boolean[][] visited = new boolean[n][n]; // 방문 여부 확인
        visited[h][w]=true;
        int[] dh = {-1,1,0,0};
        int[] dw = {0,0,-1,1};
        
        for(int i = 0; i < 4; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if(h_check >= 0 && h_check < n && w_check >= 0 && w_check < n && !visited[h_check][w_check]){
                visited[h_check][w_check]=true;
                if(board[h_check][w_check].equals(now_color)){
                    answer++;
                }
            }
        }
        return answer;
    }
}