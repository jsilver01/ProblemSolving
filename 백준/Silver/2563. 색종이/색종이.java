import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int paper_num = scan.nextInt();
        int s = 100*paper_num;
        int no = 0;

        boolean[][] papers = new boolean[100][100];

        for(int i = 0; i < paper_num; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int X = x+10;
            int Y = y+10;
            for(int j = x; j < X; j++){
                for(int k = y; k < Y; k++){
                    if(!papers[j][k]){
                        papers[j][k] = true;
                    } else{
                        no++;
                    }
                }
            }
        }
        s = s - no;
        System.out.println(s);
    }
}
