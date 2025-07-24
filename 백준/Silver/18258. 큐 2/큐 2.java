
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령의 수

        Deque<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order){
                case "push" :
                    int num = Integer.parseInt(st.nextToken());
                    queue.push(num);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(queue.pollLast()+"\n");
                    }
                    break;

                case "size":
                    sb.append(queue.size()+"\n");
                    break;

                case "empty":
                    if(queue.isEmpty()){
                        sb.append("1\n");
                    }else{
                        sb.append("0\n");
                    }
                    break;

                case "front":
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else{
                        sb.append(queue.getLast()+"\n");
                    }
                    break;

                case "back":
                    if(queue.isEmpty()) {
                        sb.append("-1\n");
                    }else{
                        sb.append(queue.getFirst()+"\n");
                    }
                    break;

            }
        }
        System.out.println(sb);
    }
}
