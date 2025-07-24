import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 갯수

        for(int i = 0; i < T; i++){
            String func = br.readLine();
            int cnt = Integer.parseInt(br.readLine()); // 배열에 들어 있는 정수의 개수
            String[] inputArr = br.readLine().replace("[","").replace("]","").split(",");
            boolean isReversed = false;
            boolean isInputD = false;

            Deque<Integer> deq = new LinkedList<>();
            for(int j = 0; j < cnt; j++){
                deq.add(Integer.parseInt(inputArr[j]));
            }

            for(char word : func.toCharArray()){
                if(word=='R'){
                    isReversed = !isReversed;
                }else{ // D 인 경우
                    if(deq.isEmpty()){
                        isInputD = true;
                        break;
                    }else{
                        if(isReversed){
                            deq.removeLast();
                        }else{
                            deq.removeFirst();
                        }
                    }
                }
            }
            if(isInputD){
                System.out.println("error");
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while(!deq.isEmpty()){
                    sb.append(isReversed?deq.removeLast():deq.removeFirst());
                    if(!deq.isEmpty()) sb.append(",");
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}
