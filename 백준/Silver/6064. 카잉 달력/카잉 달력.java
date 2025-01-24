import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    /**
     * x < M 이면 x' = x+1 이고 그렇지 않으면(x>=M) x'=1
     * y < N 이면 y' = y+1 이고 그렇지 않으면(y>=N) y'=1
     * <M:N> 은 세상 종말
     * 만약에 m=3 n=4 라고 하면 1:1 2:2 3:3 1:4 2:1 3:2 1:3 2:4 3:1 1:2 2:3 3:4
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());// 테스트 케이스 갯수 입력받기

        int M, N;
        int x = 1;
        int y = 1;
        // 테스트 케이스 갯수만큼 반복하기
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 테스트 케이스의 매 입력마다 한줄에 M,N,x,y 순으로 주어짐
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            System.out.println(countCheck(M,N,x,y));
        }
    }

    public static int countCheck(int M, int N, int x, int y) {
        // x의 값을 기준으로 최대 LCM(M,N) 까지 탐색
        int lcm = M * N / gcd(M, N);

        for(int k = x; k <= lcm; k += M) {
            // k를 N으로 나눈 나머지가 y와 같은지 확인
            if((k - y) % N == 0) {
                return k;
            }
        }

        return -1;
    }
    // 최대공약수 계산하는 메소드
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a %b);
    }
}
