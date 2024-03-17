import java.util.Scanner;

public class Main {
    /**
     * 1. int[] 배열 몇개 만들지 입력받아서 num 에 저장
     * 2. 배열에 저장하기
     * 3. for 문으로 배열 돌면서 최대 최소 찾기
     * 4. 최대 * 최소 = 정답
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = scan.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int j =0; j < num; j++){
            if(arr[j] >= max){
                max = arr[j];
            }
            if(arr[j] < min){
                min = arr[j];
            }
        }

        int result = min * max;
        System.out.println(result);
    }
}
