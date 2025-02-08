import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static ArrayList<Integer>[] graph;
    static boolean[] visited_dfs;
    static boolean[] visited_bfs;
    static Queue<Integer> queue_bfs;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());// 정점
        M = Integer.parseInt(st.nextToken());// 간선
        V = Integer.parseInt(st.nextToken());// 시작할 정점의 번호

        graph = new ArrayList[N+1];
        for(int i = 0; i < N+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 1; i < N+1; i++){
            Collections.sort(graph[i]);
        }

        visited_dfs = new boolean[N+1];
        dfs(V);
        String answer = sb.toString();
        System.out.println(answer);
        sb.setLength(0); // sb 초기화

        visited_bfs = new boolean[N+1];
        bfs(V);
        answer = sb.toString();
        System.out.println(answer);
    }

    static void bfs(int start) {
        queue_bfs = new LinkedList<>();
        queue_bfs.offer(start);
        visited_bfs[start] = true;

        while (!queue_bfs.isEmpty()) {
            int current = queue_bfs.poll();
            sb.append(current).append(" ");
            for (int next : graph[current]) {
                if (!visited_bfs[next]) {
                    visited_bfs[next] = true;
                    queue_bfs.offer(next);
                }
            }
        }
    }

    static void dfs(int V){
        visited_dfs[V] = true;
        sb.append(V).append(" ");

        for(int next : graph[V]){
            if(!visited_dfs[next]){
                dfs(next);
            }
        }
    }
}
