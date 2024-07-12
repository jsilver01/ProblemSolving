import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int round = Integer.parseInt(br.readLine());
        for(int i = 0; i < round; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer a = Integer.parseInt(st.nextToken());
            Integer b = Integer.parseInt(st.nextToken());
            Integer sum = a+b;
            System.out.println(sum);
        }
    }
}
