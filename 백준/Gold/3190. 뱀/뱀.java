import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 보드의 크기
        int[][] board = new int[n][n];
        int k = Integer.parseInt(br.readLine()); // 사과의 갯수

        for(int i = 0; i < k; i++){ // 사과 배열
            st = new StringTokenizer(br.readLine());
            int haeng = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            board[haeng-1][row-1] = 1;
        }

        int l = Integer.parseInt(br.readLine()); // 방향 변환 횟수
        HashMap<Integer, String> spin = new HashMap<>();
        for(int i = 0; i < l; i++){ //방향 전환 저장
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            String c = st.nextToken();
            spin.put(x,c);
        }

        int time = 0;
        int cx = 0;
        int cy = 0;// 처음 시작할 뱀의 위치
        int[] dx = {0,1,0,-1};
        int[] dy = {1, 0, -1, 0}; // 동, 남, 서, 북 순으로 이동
        int d = 0;
        Deque<snake> sq = new LinkedList<>();
        sq.add(new snake(0,0));
        while(true){
            time++; // 움직일 때 마다 시간 증가

            int nx = cx + dx[d];
            int ny = cy + dy[d];
            if(nx < 0 || nx >= n || ny < 0 || ny >= n){ // 벽에 부딪친 경우
                break;
            }

            for(snake t : sq){
                if(t.colum == nx && t.row == ny){
                    // 뱀 몸통과 충돌한 경우
                    System.out.println(time);
                    return;
                }
            }

            if(board[nx][ny] == 1){ // 사과 만난 경우
                board[nx][ny] = 0;
                sq.add(new snake(nx,ny));
            }else{ // 사과 안만난 경우 꼬리 지우기
                sq.add(new snake(nx,ny));
                sq.poll();
            }

            if(spin.containsKey(time)){
                if(spin.get(time).equals("D")){ // 오른쪽 이동
                    d+=1;
                    if(d==4)
                        d = 0;
                }else{ // 왼쪽 이동
                    d-= 1;
                    if(d==-1)
                        d = 3;
                }
            }
            cx = nx;
            cy = ny;
        }
        System.out.println(time);
    }

    static class spin{
        public int x;
        public String c;

        public spin(int x, String c) {
            this.x = x;
            this.c = c;
        }
    }

    static class snake{
        public int colum;
        public int row;

        public snake(int colum, int row) {
            this.colum = colum;
            this.row = row;
        }
    }
}
