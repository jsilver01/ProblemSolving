import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int x, y, target1, target2;
    static int answer = -1;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 전체 사람 수
        st = new StringTokenizer(br.readLine()," ");

        // 촌수 계산할 두 사람
        target1 = Integer.parseInt(st.nextToken());
        target2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 주어질 관계의 개수

        graph = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine()," ");
            x = Integer.parseInt(st.nextToken()); // 부모
            y = Integer.parseInt(st.nextToken()); // 자식

            graph[x][y]=1;
            graph[y][x]=1;
        }
        visited = new boolean[n+1];
        dfs(target1, 0);
        System.out.println(answer);
    }

    static void dfs(int tar1, int cnt){
        visited[tar1] = true;

        for(int i = 1; i < graph[tar1].length; i++){
            if(graph[tar1][i] == 1 & !visited[i]){
                if(i == target2){
                    answer = cnt+1;
                    return;
                }
                dfs(i, cnt+1);
            }
        }

    }
}
