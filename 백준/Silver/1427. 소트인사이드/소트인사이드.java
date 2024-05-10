import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        int length = N.length();
        int num = Integer.parseInt(N);
        Integer[] intarr = new Integer[length];

        for(int i = 0; i < length; i++){
            int a = num % 10;
            intarr[i] = a;
            num /= 10;
        }
        Arrays.sort(intarr, Collections.reverseOrder());

        for(int i = 0; i < length; i++){
            System.out.print(intarr[i]);
        }
    }
}
