import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고하는 수의 개수

        int result = 0;
        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            while(deque.getFirst()!=num){
                if(deque.indexOf(num) <= deque.size()/2){
                    //앞에서 빼기
                    result++;
                    deque.addLast(deque.removeFirst());
                }else{ //deque.indexOf(num) > deque.size()/2
                    //뒤에서 빼기
                    result++;
                    deque.addFirst(deque.removeLast());
                }
            }
            deque.removeFirst();
        }

        System.out.println(result);
    }
}
