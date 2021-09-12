package d1;

import java.io.*;

public class Doubledouble {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int x = 1;
		System.out.print(x+" ");
		for (int i=1;i<=num;i++) {
			x *= 2;
			System.out.print(x+" ");
		// �ŵ����� : Math.pow(base, exponent)
		}

	}

}
