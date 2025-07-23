import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 빌딩의 개수

        Stack<Long> buildings = new Stack<>();
        long answer = 0;
        for (int i = 0; i <N; i++) {
            long currentHeight = Long.parseLong(br.readLine());
            while(!buildings.isEmpty()&& currentHeight >= buildings.peek()){
                buildings.pop();
            }
            answer+=buildings.size();
            buildings.push(currentHeight);
        }
        System.out.println(answer);
    }
}
