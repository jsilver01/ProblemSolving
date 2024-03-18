import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * 1. 첫줄에 입력받은 숫자로 열 개수 정하기 - N
     * 2. N x 2 배열 만들기
     * 3. for 문으로 저장하기
     * 4. for 문으로 배열 순회하기
     * 4-1. y 좌표를 기준으로 먼저 확인하고
     * 4-2. y 좌표가 동일한 경우 x 좌표로 확인하기
     * 5. for 문으로 배열 전부 출력하기
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        Arrays.sort(arr , (a,b)->{
            if(a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else{
                return Integer.compare(a[1],b[1]);
            }
        });

        for(int j = 0; j < N; j++){
            System.out.println(arr[j][0]+ " " + arr[j][1]);
        }
    }
}
