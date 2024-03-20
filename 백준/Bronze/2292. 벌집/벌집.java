import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int num = 2;
        int x = 1;
        while(true){
            if(N == 1){
                num = 1;
                break;
            }
            if(N > (6*x)+1){
                x += num;
                num++;
            }else{
                break;
            }
        }

        System.out.println(num);
    }
}
