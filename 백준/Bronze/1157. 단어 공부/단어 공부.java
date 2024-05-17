import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();
        Integer[] alphabet = new Integer[27];

        Arrays.fill(alphabet,0);

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i);
            alphabet[now-65]++;
        }

        Integer max = alphabet[0];
        int maxIndex = 0;
        for(int i = 1; i < 27; i++){
            if(alphabet[i]>max){
                max = alphabet[i];
                maxIndex = i;
            }
        }

        int count = Collections.frequency(List.of(alphabet),max);
        if(count!=1){
            System.out.println("?");
        }else{
            char result = (char)(maxIndex+65);
            System.out.println(result);
        }
    }
}
