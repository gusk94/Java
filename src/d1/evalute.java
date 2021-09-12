package d1;

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
			// Math.round(double) : �ݿø�, Math.floor() : ����, Math.ceil() : �ø�, Math.abs() : ����
			System.out.println("#"+t+" "+Math.round(sum/10));
		}

	}

}
