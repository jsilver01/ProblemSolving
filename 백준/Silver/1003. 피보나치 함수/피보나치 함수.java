
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int one;
	static int zero;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int testCase = Integer.parseInt(br.readLine()); // 테스트케이스 갯수
		for(int i = 0; i < testCase; i++) {
			int N = Integer.parseInt(br.readLine()); // 입력으로 주어지는 N
			fibonacci(N);
		}
		bw.flush();
		bw.close();
	}

	private static void fibonacci(int n) throws IOException {
		one = 0;
		zero = 1;
		int tmp;
		for(int i = 0; i < n; i++) {
			tmp = zero;
			zero = one;
			one = tmp + one;
		}
		bw.write(zero + " " + one+ "\n");
	}

}
