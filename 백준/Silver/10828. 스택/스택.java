import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stackInt = new Stack<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();
            int num = 0;
            switch (command) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    stackInt.push(num);
                    break;
                case "pop":
                    if (stackInt.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(stackInt.pop());
                    }
                    break;
                case "size":
                    System.out.println(stackInt.size());
                    break;
                case "empty":
                    if(stackInt.empty()){
                        System.out.println("1");
                    }else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    if(stackInt.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(stackInt.peek());
                    }
                    break;
            }
        }

    }
}
