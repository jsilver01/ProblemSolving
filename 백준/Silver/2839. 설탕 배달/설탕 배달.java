import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = -1;

        for (int five = N / 5; five >= 0; five--) {
            int remain = N - (five * 5);
            if (remain % 3 == 0) {
                count = five + (remain / 3);
                break;
            }
        }

        System.out.println(count);
    }
}
