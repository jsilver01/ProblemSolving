import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        int max = N;
        int min = M;
        if(N < M){
            max = M;
            min = N;
        }

        int total = (max-1) + max*(min-1);
        System.out.println(total);
    }
}
