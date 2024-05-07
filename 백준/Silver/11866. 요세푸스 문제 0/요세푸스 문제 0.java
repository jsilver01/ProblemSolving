import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int k = scan.nextInt() - 1;

        ArrayList<Integer> numarr = new ArrayList<>(N);
        for(int i =0; i<N; i++){
            numarr.add(i+1);
        }

        int K = 0;
        ArrayList<Integer> result = new ArrayList<>(N);
        while(!numarr.isEmpty()){
            K = (K+k) % numarr.size();
            result.add(numarr.get(K));
            numarr.remove(K);
        }

        System.out.print("<");
        for(int i = 0; i<N; i++){
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");

    }
}
