import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        int ab = Integer.parseInt(a+b);

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intC = Integer.parseInt(c);
        int intsum = intA + intB - intC;

        System.out.println(intsum);
        System.out.println(ab-intC);
    }
}
