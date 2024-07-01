import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null){
                if(input.equals(".")){
                        break;
                }

                String[] inputs = input.split("");
                Stack<String> stack = new Stack<>();

                boolean isBalanced = true;
                for (String str : inputs) {
                        if (str.equals("(") || str.equals("[")) {
                                stack.push(str);
                        } else if (str.equals(")")) {
                                if (stack.isEmpty() || !stack.peek().equals("(")) {
                                        isBalanced = false;
                                        break;
                                } else {
                                        stack.pop();
                                }
                        } else if (str.equals("]")) {
                                if (stack.isEmpty() || !stack.peek().equals("[")) {
                                        isBalanced = false;
                                        break;
                                } else {
                                        stack.pop();
                                }
                        }
                }

                if (!stack.isEmpty()) {
                        isBalanced = false;
                }

                if (isBalanced) {
                        System.out.println("yes");
                } else {
                        System.out.println("no");
                }
        }
    }
}
