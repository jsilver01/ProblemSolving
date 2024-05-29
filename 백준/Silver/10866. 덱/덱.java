import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int X = 0;

            switch (command){
                case "push_front":
                    X = Integer.parseInt(st.nextToken());
                    deque.addFirst(X);
                    break;
                case "push_back":
                    X = Integer.parseInt(st.nextToken());
                    deque.addLast(X);
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.poll());
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;
                case "front":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case "back":
                    if(deque.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }
    }
}
