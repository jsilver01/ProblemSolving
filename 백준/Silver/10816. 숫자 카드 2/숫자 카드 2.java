import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> frequency = new HashMap<>();

        for(int i = 0; i < N; i++){
            String element = st.nextToken();
            list.add(element);
            frequency.put(element,frequency.getOrDefault(element,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String str = st.nextToken();
            if(frequency.get(str) == null){
                sb.append("0").append(" ");
            }else{
                sb.append(frequency.get(str)).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}
