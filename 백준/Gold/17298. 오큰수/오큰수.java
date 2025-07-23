import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 수열의 크기

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> numStack = new Stack<>();
        int[] tempArr = new int[N];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            tempArr[i] = num;
        }

        for(int i = N-1; i >=0; i--){
            int currentNum = tempArr[i];
            while(!numStack.isEmpty() && currentNum >= numStack.peek()) {
                numStack.pop();
            }
            if(!numStack.isEmpty() && currentNum < numStack.peek()){
                tempArr[i]=numStack.peek();
                numStack.push(currentNum);
            }else{
                tempArr[i]=-1;
                numStack.push(currentNum);
            }
        }

        for(int i = 0; i < N; i++){
            sb.append(tempArr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
