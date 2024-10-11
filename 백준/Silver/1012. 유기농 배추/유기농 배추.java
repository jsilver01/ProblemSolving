import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int M,N,K;
	static int[][] ground;
	static boolean[][] visit;
	static int count;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int cx = x+dx[i];
			int cy = y+dy[i];
			
			if(cx>=0 && cy >=0 && cx < M && cy < N) {
				if(!visit[cx][cy] && ground[cx][cy] ==1) {
					dfs(cx,cy);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		int test = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			ground = new int[M][N];
			visit = new boolean[M][N];
			
			K = Integer.parseInt(st.nextToken());
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				ground[x1][y1] = 1;
			}
			
			for(int x = 0; x < M; x++) {
				for(int y = 0; y < N; y++) {
					if(ground[x][y] == 1 && !visit[x][y]) {
						dfs(x,y);
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
		
	}

}
