import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 기다리고 있는 사람의 수

        Stack<long[]> heights = new Stack<>();
        long result = 0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long currentHeight = Long.parseLong(st.nextToken());
            long count = 1;
            while(!heights.isEmpty() && currentHeight >= heights.peek()[0]){
                result += heights.peek()[1];
                if(heights.peek()[0] == currentHeight){
                    count += heights.peek()[1]; // 연결된 갯수 만큼 더해서 같은 숫자가 몇개 연속인지 알 수 있도록 저장하기
                }
                heights.pop();
            }
            if(!heights.isEmpty()){
                result++;
            }
            heights.push(new long[]{currentHeight,count});
        }
        System.out.println(result);

    }
}
