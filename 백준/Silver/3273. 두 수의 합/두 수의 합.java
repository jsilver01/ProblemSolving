import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    /**
     * 정렬 후 투 포인터 방법
     * 1. 배열을 순서대로 정렬한다.
     * 2. left 와 right 를 양끝으로 지정한다.
     * 3. 두 수의 합이 target 보다 크다면 right 를 왼쪽으로,
     *    두 수의 합이 target 보다 작다면 left 를 오른쪽으로 옮긴다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int target = Integer.parseInt(br.readLine());

        Arrays.sort(numArr);

        int left = 0;
        int right = n-1;
        int total = 0;

        while(left < right){
            int sum = numArr[left] + numArr[right];
            if(sum > target){
                right--;
            } else if (sum < target) {
                left++;
            } else{
                total++;
                left++;
                right--;
            }
        }
        System.out.println(total);
    }
}
