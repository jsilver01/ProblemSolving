import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int w, h;
    static int answer;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,-1,1,-1,1,-1,1};
    static List<Integer> island;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        island = new LinkedList<>();
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        answer = 0;

        while (w != 0 && h != 0) {
            map = new int[h][w];
            visited = new boolean[h][w];

            // 지도 만들기
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    map[i][j] = num;
                }
            }

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(map[i][j]==1 && !visited[i][j]){
                        dfs(i,j);
                        answer++;
                    }
                }
            }

            island.add(answer);
            // 다음 테스트 케이스 입력 받기
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            answer = 0;
        }

        int islandSize = island.size();
        for(int i = 0; i < islandSize; i++){
            System.out.println(island.get(i));
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i < 8; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX < 0 || nextX >= h || nextY < 0 || nextY >= w){
                continue;
            }

            if(!visited[nextX][nextY] && map[nextX][nextY]==1){
                dfs(nextX,nextY);
            }
        }
    }
}
