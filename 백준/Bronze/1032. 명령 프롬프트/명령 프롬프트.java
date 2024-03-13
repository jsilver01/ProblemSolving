import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num];

        for(int i = 0; i < num; i++){
            arr[i] = scan.next();
        }

        StringBuilder result = new StringBuilder(arr[0]);
        for(int i = 1; i < num; i++){
            for(int j = 0; j < arr[0].length(); j++){
                if(arr[0].charAt(j) != arr[i].charAt(j)){
                    result.setCharAt(j,'?');
                }
            }
        }
        System.out.println(result);
    }
}
