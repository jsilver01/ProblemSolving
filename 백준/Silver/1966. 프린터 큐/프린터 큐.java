import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        while(num-- > 0) {
            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())}); //원래 순서랑 중요도
            }

            int count = 0;
            while(!queue.isEmpty()){
                int[] important = queue.poll();
                boolean isMax = false;

                for(int i =0; i < queue.size(); i++){
                    if(important[1]<queue.get(i)[1]){
                        isMax = true;
                        break;
                    }
                }
                if(isMax){
                    queue.add(important);
                }else{
                    count++;
                    if(important[0]==M){
                        System.out.println(count);
                        break;
                    }
                }
            }
        }
    }
}
