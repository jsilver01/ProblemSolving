import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(answer(A,B,C));
    }

    public static long answer(long a, long b, long c){
        if(b==1){
            return a%c;
        }
        long temp = answer(a,b/2,c);
        if(b%2==0){ //짝수인 경우
            return (temp * temp)%c;
        }else{//홀수인 경우
            return (temp* answer(a,b/2+1,c))%c;
        }
    }
}
