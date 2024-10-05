import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		int x1;
		int x2;
		int y1;
		int y2;
		int r1;
		int r2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			
			int d = calLoc(x1,y1,x2,y2);
			if(d==0 && r1==r2) {
				System.out.println("-1");
			}else {
				if(d == (r1+r2)*(r1+r2) || d == (r1-r2)*(r1-r2)) { // 외접 혹은 내접 
					System.out.println("1");
				}else if(d > (r1+r2)*(r1+r2) || d < (r1-r2)*(r1-r2)){
					System.out.println("0");
				}else {
					System.out.println("2");
				}
			}
		}		
	}
	

	static int calLoc(int x1, int y1, int x2, int y2) {
		int result = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
		return result;
	}
}
