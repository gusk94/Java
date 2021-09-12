package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class reverse{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = num; i >= 0 ; i--) {
			System.out.print(i+" ");
		}
	}

}
