import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        scan.nextLine();
        String[] chess = new String[row];

        for (int i = 0; i < row; i++) {
            chess[i] = scan.nextLine();
        }

        int sol = Integer.MAX_VALUE;
        for(int i = 0; i <= row-8; i++){
            for(int j = 0; j <= col-8; j++){
                int curSol = getSolution(i,j,chess);
                if(sol > curSol) sol = curSol;
            }
        }
        System.out.println(sol);
        scan.close();
    }
    public static int getSolution(int startRow, int startCol, String[] chess){
        String[] orgBoard = {"WBWBWBWB","BWBWBWBW"};
        int whiteSol = 0;
        for(int i = 0; i < 8; i++){
            int row = startRow + i;
            for(int j = 0; j<8;j++){
                int col = startCol + j;
                if(chess[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
                    whiteSol++;
                }
            }
        }
        return Math.min(whiteSol, 64 - whiteSol);
    }
}
