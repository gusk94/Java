package d1;

import java.io.*;
import java.util.StringTokenizer;

public class divide {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=1;i<=T;i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			System.out.println("# "+i+" "+a/b + " "+ a%b);
		}

	}

}
