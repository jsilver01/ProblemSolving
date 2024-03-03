import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i = 0; i < num/4 ; i++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
