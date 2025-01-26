import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L, C;
    static String[] alphabet;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        alphabet = new String[C];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i++){
            alphabet[i] = st.nextToken();
        }
        Arrays.sort(alphabet);
        backtrack(0,0,"");
    }

    public static void backtrack(int start, int depth, String current){
        if(depth == L){ // 총 L 개의 문자가 모였을 때
            if(checkPassword(current)){
                System.out.println(current);
                return;
            }
        }

        for(int i = start; i < C; i++){
            backtrack(i+1, depth+1, current+alphabet[i]);
        }
    }

    static boolean checkPassword(String current){
        int mo = 0;
        int ja = 0;

        for(char c : current.toCharArray()){
            if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
                mo++;
            }else{
                ja++;
            }
        }
        if(mo>=1 && ja>=2){
            return true;
        }else{
            return false;
        }
    }
}
