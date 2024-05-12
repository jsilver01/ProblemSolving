import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int[] arr = {64,32,16,8,4,2,1};
        int count = calcount(arr, X);

        System.out.println(count);
    }

    static int calcount(int[] arr, int X){
        int cnt=0;
        int addnum = 0;
        while(X!=0){
            for(int i = 0; i<7; i++){
                if(arr[i]<=X){
                    addnum += arr[i];
                    X -= arr[i];
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
