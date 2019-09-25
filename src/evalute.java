import java.io.*;
import java.util.StringTokenizer;

public class evalute {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int t=1;t<=n;t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			double sum = 0;
			while (stk.hasMoreTokens()) {
				sum += Integer.parseInt(stk.nextToken());
			}
			// Math.round(double) : 반올림, Math.floor() : 버림, Math.ceil() : 올림, Math.abs() : 절댓값
			System.out.println("#"+t+" "+Math.round(sum/10));
		}

	}

}
