import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] xyArr = new int[n][2];

        for(int i = 0; i < n; i++){
            // 좌표 저장하기
            st = new StringTokenizer(br.readLine());
            xyArr[i][0] = Integer.parseInt(st.nextToken());
            xyArr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 신발끈 공식?
        double result = 0;
        for(int i = 0; i < n; i++){
            result += (double)xyArr[i][0] * xyArr[(i+1)%n][1];
            result -= (double)xyArr[(i+1)%n][0] * xyArr[i][1];
        }
        System.out.println(String.format("%.1f",Math.abs(result) / 2));
    }
}
