import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] a;
	static boolean[] flag;
	
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int n = Integer.parseInt(br.readLine());
		 
		 a = new int[n];
		 flag = new boolean[n];
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 for(int i = 0; i < n; i++) {
			 a[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 checkArr(a);
		 
		 for(int i = 0; i < n; i++) {
			 if(i==n-1) {
				 System.out.print(a[i]);
			 }else {
				 System.out.print(a[i] + " ");
			 }
		 }
	}
	
	public static void checkArr(int[] a) {
		int count = 0;
		 int targetnum = 1;
		 for(int j = 0; j < 1001; j++) {
			 for(int i = 0; i < a.length; i++) {
				 if(targetnum==a[i]) {
					 if(flag[i]!=true) { //한번도 건들여진적 없다는 의미
						 a[i] = count;
						 count++;
						 flag[i] = true;
					 }
				 }
				 
			 }
			 targetnum++;
		 }
	}
}
