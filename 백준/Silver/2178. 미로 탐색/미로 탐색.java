import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                maze[i][j] = line.charAt(j)-'0';
            }
        }

        bfs(0,0);
        System.out.println(maze[N-1][M-1]);
    }

    static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        visited[x][y] = true;

        while(!queue.isEmpty()){
            Point currentPoint = queue.poll();
            for(int i = 0; i < 4; i++){
                int nextX = currentPoint.x + dx[i];
                int nextY = currentPoint.y + dy[i];

                if(nextX < 0 || nextX >= N || nextY <0 || nextY >= M){
                    continue; // 범위 밖으로 나가버림
                }
                if(maze[nextX][nextY] == 0){
                    continue; // 막힌 길
                }
                if(visited[nextX][nextY]){
                    continue; // 이미 방문한 길
                }
                queue.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
                maze[nextX][nextY] = maze[currentPoint.x][currentPoint.y] + 1;
            }
        }
    }
}
