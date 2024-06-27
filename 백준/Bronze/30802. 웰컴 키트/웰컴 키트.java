import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] T_shirts = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++){
            T_shirts[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        calculateT_shirts(T_shirts, T);
        calculatePen(N,P);
    }

    static void calculateT_shirts(int[] T_shirts, int T){
        int num = 0;
        for(int i = 0; i < 6; i++){
            num += (int)(T_shirts[i]/T);
            if(T_shirts[i]%T>0){
                num++;
            }
        }
        System.out.println(num);
    }

    static void calculatePen(int N, int T){
        System.out.print(N/T + " "+ N%T);
    }
}
