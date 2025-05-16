import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        int idx = k-1;
        while(!list.isEmpty()){
            result.add(list.get(idx));
            list.remove(idx);
            idx += k-1;
            if(list.size()!=0){
                idx %= list.size();
            }
        }

        System.out.print("<");
        for(int i = 0; i < result.size(); i++){
            if(i==result.size()-1){
                System.out.print(result.get(i));
                System.out.print(">");
                return;
            }
            System.out.print(result.get(i) +", ");
        }
    }
}
