package d1;

import java.io.*;
import java.util.StringTokenizer;

public class odd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int t=1;t<=n;t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int sum = 0;
			while (stk.hasMoreTokens()) {
				int x = Integer.parseInt(stk.nextToken());
				if (x%2 == 1) {
					sum += x;
				}
			}
			System.out.println("#"+t+" "+sum);
		}

	}

}
