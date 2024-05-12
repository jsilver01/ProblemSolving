import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
           if(checkStr(scan.next())){
               count++;
           }
        }
        System.out.println(count);
    }

    static boolean checkStr(String str) {
        boolean[] checkAlphabet = new boolean[26];
        int prev = -1;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                // 앞 문자랑 다른 문자
                if (!checkAlphabet[now - 97]) {
                    checkAlphabet[now - 97] = true;
                    prev = now;
                }else{
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }
}
