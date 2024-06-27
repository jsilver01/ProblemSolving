import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < N+1; i++){
            queue.add(i);
        }

        while(queue.stream().count()!=1){
            queue.poll(); // 제일 위에 있는 카드 버리기
            int temp = queue.peek();
            queue.poll();
            queue.add(temp);
        }
        System.out.println(queue.peek());
    }

}
