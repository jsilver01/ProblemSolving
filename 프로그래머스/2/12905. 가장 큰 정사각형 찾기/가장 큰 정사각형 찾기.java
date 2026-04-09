class Solution
{
    public int solution(int [][]board)
    {
        int col = board.length;
        int row = board[0].length;
        
        for(int i = 1; i < col; i++){
            for(int j = 1; j < row; j++){
                if(board[i][j]==1){
                    if((board[i-1][j]!=0) && (board[i-1][j-1]!=0) && (board[i][j-1]!=0)){
                        board[i][j]= Math.min(board[i-1][j], Math.min(board[i-1][j-1],board[i][j-1]))+1;
                    }
                }
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                answer = Math.max(answer, board[i][j]);
            }
        }
        
        return answer*answer;
    }
}