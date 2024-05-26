import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int last = scan.nextInt();
        int[] arr= new int[1000];
        int sum = 0;
        int cnt = 0;
        for(int i = 1; i<=last; i++){
            for(int j = 1; j<=i; j++){
                cnt++;
                if(first<=cnt && cnt <= last){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
