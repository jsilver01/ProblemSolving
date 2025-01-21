import java.util.Map;
import java.util.Scanner;

public class Main {
    /**
     * 에라토스테네스의 체 ( 소수 구하는 대표적인 방법 )
     * k = 2 부터 루트 N 이하까지 반복하여 자연수들 중 k 를 제외한 k 의 배수들을 제외시킨다
     */
    public static boolean[] prime; // 소수를 체크할 배열
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        int n = scanner.nextInt();
        while(n != 0){
            make_prime(n);

            for(int i = n+1; i <= 2*n; i++){
                if(!prime[i-n]){
                    answer += 1;
                }
            }
            System.out.println(answer);
            n = scanner.nextInt();
            answer = 0;
        }
    }

    public static void make_prime(int n){
        prime = new boolean[n+1]; // 0-n
        // 소수면 false, 소수가 아니면 true

        // n부터 2n까지의 수들을 체크
        for (int i = 2; i <= Math.sqrt(2 * n); i++) {
            // j의 시작값을 i*i와 n 중 큰 값으로 설정
            // n보다 작은 배수는 확인할 필요가 없음
            int start = Math.max(i * i, ((n + i - 1) / i) * i); // n 이상의 첫 i의 배수

            for (int j = start; j <= 2 * n; j += i) {
                if (j > n) { // n보다 큰 수만 체크
                    prime[j - n] = true; // j-n 인덱스에 저장
                }
            }
        }
    }
}
