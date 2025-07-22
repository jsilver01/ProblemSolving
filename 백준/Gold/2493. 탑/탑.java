import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<int[]> tops = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자가 n 개 만큼 들어올거니까
        for(int i = 0; i < N; i++){
            int top = Integer.parseInt(st.nextToken()); // 입력으로 들어온 숫자
            while(!tops.isEmpty()){
                if(tops.peek()[1]>=top){ // 스택에서 하나 꺼내서 idx 값말고 집어넣은 값 확인
                    System.out.print(tops.peek()[0]+" ");
                    break;
                }
                tops.pop();
            }
            if(tops.isEmpty()){
                System.out.print("0 ");
            }
            tops.push(new int[] {i+1, top});
        }
    }
}
