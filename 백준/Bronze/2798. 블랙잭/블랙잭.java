import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    /**
     * 1. 첫줄에 입력받는 두 숫자를 N 과 M 으로 저장하기
     * 2. N장의 카드중 3장씩 더한 결과를 배열에 저장하기
     * 3. 그 배열 안에서 M 을 넘지 않으면서 M 에 최대한 가까운 합을 구하기
     * 4. 그거 출력
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] list = new int[N];

        for(int i = 0; i < N; i++){
            list[i] = scan.nextInt();
        }

        int first = 0;
        int second = 1;
        int third = 2;

        int result = 0;

        while(first < N-2){
            int sum = list[first] + list[second] + list[third];

            if( sum<=M && result < sum){
                result = sum;
            }
            third++;
            if(third > N-1){
                second++;
                third = second + 1;
            }
            if(second > N-2){
                first++;
                second = first +1;
                third = second +1;
            }
        }

        System.out.println(result);
    }
}
