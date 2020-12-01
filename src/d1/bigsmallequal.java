package d1;

import java.io.*;
import java.util.StringTokenizer;

public class bigsmallequal {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int t=1;t<=n;t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			if (a>b) {
				System.out.println("#"+t+" "+">");
			} else if (a<b) {
				System.out.println("#"+t+" "+"<");
			} else {
				System.out.println("#"+t+" "+"=");
			}
		}

	}

}
