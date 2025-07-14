import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> stack = new Stack<>();
        int inputNum = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            int num = scan.nextInt();
            while(num>=inputNum){
                sb.append("+\n");
                stack.push(inputNum);
                inputNum++;
            }
            if (stack.peek()!=num) {
                System.out.println("NO");
                return;
            }
            sb.append("-\n");
            stack.pop();
        }

        System.out.println(sb);
    }
}
