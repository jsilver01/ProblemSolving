import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int standard = 1;
        int i = 2;

        while(true){
            if(X <= standard){
                break;
            }
            standard += i;
            i++;
        }

        int first = standard - i + 2;
        int number = X - first;
        int bunja;
        int bunmo;

        if(i%2==0){
            bunja = i - 1;
            bunmo = 1;
            for(int j = 0; j < number; j++){
                bunmo++;
                bunja--;
            }
        }else{
            bunmo = i - 1;
            bunja= 1;

            for(int j = 0; j < number; j++){
                bunja++;
                bunmo--;
            }
        }
        System.out.println(bunja + "/" + bunmo);
    }
}
