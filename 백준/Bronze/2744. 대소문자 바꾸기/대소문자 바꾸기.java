
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        for(String s : st){
            if(s.equals(s.toUpperCase())){
                sb.append(s.toLowerCase());
            }else{
                sb.append(s.toUpperCase());
            }
        }

        System.out.println(sb);

    }
}
