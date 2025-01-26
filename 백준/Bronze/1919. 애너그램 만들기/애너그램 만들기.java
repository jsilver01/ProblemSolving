import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> f_word = new ArrayList<>();
        ArrayList<String> s_word = new ArrayList<>();
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for(char c : word.toCharArray()){
            f_word.add(String.valueOf(c)); // 첫번째 단어 분리해서 저장하기
        }
        int f_size = f_word.size();

        word = br.readLine();
        for(char c : word.toCharArray()){
            s_word.add(String.valueOf(c)); // 두번쨰 단어 분리해서 저장하기
        }

        for(int i = f_size -1; i >= 0; i--){
            if(s_word.contains(f_word.get(i))){
                s_word.remove(f_word.get(i));
                f_word.remove(i);
            }
        }
        answer = f_word.size() + s_word.size();
        System.out.println(answer);
    }
}
