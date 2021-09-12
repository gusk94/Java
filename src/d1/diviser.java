package d1;

import java.io.*;

public class diviser {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i=1;i<=num;i++) {
			int d = num%i;
			if (d == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
