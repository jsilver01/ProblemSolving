import java.util.Scanner;

public class Main {
    /**
     * 1. N 입력받음
     * 2. 5로 나누고 그 갯수 세기
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int cnt = 0;
        for(int i = 1; i<= N; i++){
            int num = i;
            while(num % 5 == 0){
                num /= 5;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
