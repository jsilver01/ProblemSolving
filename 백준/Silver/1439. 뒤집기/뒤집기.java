import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = scan.next().split("");
        String temp = str[0];
        int cnt = 0;
        for(int i = 1; i < str.length; i++){
            if(!temp.equals(str[i])){
                temp = str[i];
                cnt++;
            }
        }
        if(cnt%2==0){
            System.out.println(cnt/2);
        }else{
            System.out.println(cnt/2 + 1);
        }
    }
}
