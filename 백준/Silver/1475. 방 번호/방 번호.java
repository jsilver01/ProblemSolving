import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int[] numArr = new int[10];
        for(int i = 0; i < num.length(); i++){
            int str = num.charAt(i)-'0';
            numArr[str]++;
        }
        numArr[6] = (numArr[6] + numArr[9] + 1) / 2;
        int total = Arrays.stream(numArr).limit(9).max().getAsInt();
        System.out.println(total);
    }
}
