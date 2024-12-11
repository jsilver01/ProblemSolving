import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> numArr = new ArrayList();
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            numArr.add(b-a);
        }
        numArr = new ArrayList<>(numArr.stream().sorted().collect(Collectors.toList()));
        if(numArr.size()%2==0){
            int bottom = (numArr.size()-1)/2;
            int top = numArr.size()/2;
            int up = numArr.get(top);
            int count = 0;
            for(int under = numArr.get(bottom); under <= up; under++){
                count++;
            }
            System.out.println(count);
        }else{
            System.out.println("1");
        }
    }
}
