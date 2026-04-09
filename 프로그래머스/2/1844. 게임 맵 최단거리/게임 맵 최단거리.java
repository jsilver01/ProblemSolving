import java.util.*;

class Solution {
    private static final int[] rx = {0,0,1,-1};
    private static final int[] ry = {1,-1,0,0};
    int answer = 0;

    
    public int solution(int[][] maps) {
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] visited = new int[n][m];
        
        bfs(maps, visited);
        answer = visited[n-1][m-1]; // 상대팀 진영 위치
        
        if(answer == 0){
            answer = -1; // 도달하지 못한 경우
        }
        return answer;
    }
    
    public void bfs(int[][] maps, int[][] visited){
        visited[0][0]=1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            for(int i = 0; i < 4; i++){
                int nx = x + rx[i];
                int ny = y + ry[i];
                
                if(nx<0 || nx >= maps.length || ny < 0 || ny >= maps[0].length){
                    continue;
                }
                
                if(visited[nx][ny] == 0 && maps[nx][ny]==1){
                    visited[nx][ny] = visited[x][y] +1;
                    queue.add(new int[]{nx,ny});
                }
            }
            
        }
    }
}