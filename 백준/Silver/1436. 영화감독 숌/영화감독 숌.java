import java.util.Scanner;

public class Main {
    /**
     * 브루트포스 알고리즘
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int num = 666;
        int cnt = 1;

        while(cnt != N){
            num++;
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }

        System.out.println(num);
    }
}
