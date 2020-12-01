package d1;

import java.io.*;
import java.util.StringTokenizer;

public class maxvalue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int t=1;t<=n;t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int x = 0;
			while (stk.hasMoreTokens()) {
				int y = Integer.parseInt(stk.nextToken());
				if (y > x) {
					x = y;
				}
			}
			System.out.println("#"+t+" "+x);
		}
	}

}
