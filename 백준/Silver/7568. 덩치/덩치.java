import java.util.Scanner;

public class Main {
    /**
     * 1. x 좌표 비교하기
     * 2. 비교하는 x 가 크면, y 비교
     * 2-1. y 도 크면 자기보다 큰거임
     * 2-2. y는 작다면 덩치가 같은거 -> 다음비교로 넘어가기
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[N][2];
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            arr[i][0]=scan.nextInt();
            arr[i][1]=scan.nextInt();
        }

        for(int j = 0; j < N; j++){
            int x = arr[j][0];
            int y = arr[j][1];
            int cnt = 1;
            for(int k = 0; k < N; k++){
                if(x<arr[k][0]){
                    if(y<arr[k][1]){
                        cnt++;
                    }
                }
            }
            result[j] = cnt;
        }

        for(int h = 0; h < N; h++){
            System.out.print(result[h]+" ");
        }
    }
}
