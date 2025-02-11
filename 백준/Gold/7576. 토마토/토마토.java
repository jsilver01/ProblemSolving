import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] tomato;
    static Queue<location> queue = new LinkedList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static class location{
        int x;
        int y;
        int day;

        public location(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomato = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < M; j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if(tomato[i][j]==1){
                    queue.offer(new location(i,j,0));
                }
            }
        }
        bfs();
    }

    public static void bfs(){
        int day = 0;
        while(!queue.isEmpty()){
            location loc = queue.poll();
            day = loc.day;
            for(int i = 0; i < 4; i++){
                int nx = loc.x + dx[i];
                int ny = loc.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M){
                    if(tomato[nx][ny]==0){
                        tomato[nx][ny]=1;
                        queue.add(new location(nx,ny,day+1));
                    }
                }
            }
        }

        if (checkTomato()) {
            System.out.println(day);
        }else{
            System.out.println("-1");
        }
    }

    public static boolean checkTomato(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(tomato[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}
