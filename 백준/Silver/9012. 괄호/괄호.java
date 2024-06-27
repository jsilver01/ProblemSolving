import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < T; i++){
            String input = scan.next();
            checkString(input);
        }
    }

    static void checkString(String input) {
        String[] inputs = input.split("");
        Stack<String> stack = new Stack<>();

        for(String str : inputs){
            if(str.equals("(")){
                stack.push(str);
            } else if (str.equals(")")) {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}