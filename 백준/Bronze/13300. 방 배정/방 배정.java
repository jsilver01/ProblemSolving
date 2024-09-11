import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int studentNum = Integer.parseInt(st.nextToken());
        int maximumNum = Integer.parseInt(st.nextToken());
        int[] girls = new int[7];
        int[] boys = new int[7];

        for(int i = 0; i < studentNum; i++){
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            if(sex==0){ // 여학생인 경우
                girls[year]++;
            }else{ // 남학생인 경우
                boys[year]++;
            }
        }

        int totalRoom = 0;
        for(int i = 0; i < 7; i++){
            int girl = girls[i] % maximumNum;
            int boy = boys[i] % maximumNum;
            if(girl != 0){
                totalRoom += (girls[i] / maximumNum) + 1;
            }else {
                totalRoom += (girls[i] / maximumNum);
            }
            if(boy != 0){
                totalRoom += (boys[i] / maximumNum) + 1;
            }else {
                totalRoom += (boys[i] / maximumNum);
            }
        }
        System.out.println(totalRoom);
    }
}
