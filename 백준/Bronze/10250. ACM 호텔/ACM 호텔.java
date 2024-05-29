import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); // 테스트 케이스 갯수

        for(int i = 0; i < T; i++){
            int H = scan.nextInt(); // 층갯수
            int W = scan.nextInt(); // 방갯수
            int N = scan.nextInt();

            // 층 번호 계산
            int floor = (N - 1) % H + 1;
            // 호수 번호 계산
            int roomNumber = (N - 1) / H + 1;

            // 방 번호 출력
            System.out.printf("%d%02d\n", floor, roomNumber);
        }

    }
}
