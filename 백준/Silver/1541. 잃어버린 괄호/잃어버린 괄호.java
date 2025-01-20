import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * - 가 있으면 그 뒤에를 괄호로 묶으면 된다고 생각함
     * 얘를 들어서 40 - 30 + 49 이면 - 뒤에인 30+49를 묶어버리기
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] minus = input.split("-");
        int answer = 0;

        String[] first = minus[0].split("\\+");
        for(String num : first){
            answer += Integer.parseInt(num);
        }

        for(int i = 1; i < minus.length; i++){
            int temp = 0;
            String[] nums = minus[i].split("\\+");
            for(String num : nums){
                temp += Integer.parseInt(num);
            }
            answer -= temp;
        }
        System.out.println(answer);
    }
}
