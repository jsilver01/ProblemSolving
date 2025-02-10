import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int N;
    static boolean[][] visited;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt;
    static List<Integer> home;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        home = new LinkedList<>();
        cnt = 1;

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = line.charAt(j)-'0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 & !visited[i][j]){
                    dfs(i,j);
                    home.add(cnt);
                    cnt = 1;
                }
            }
        }
        Collections.sort(home);
        int size = home.size();
        System.out.println(size);
        for(int i = 0; i < size; i++){
            System.out.println(home.get(i));
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= N){
                continue;
            }

            if(!visited[nextX][nextY] && map[nextX][nextY]==1){
                dfs(nextX, nextY);
                cnt++;
            }
        }
    }
}
