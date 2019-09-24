import java.io.*;

public class alpha {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] a = br.readLine().toCharArray();
		for (int i = 0;i<a.length;i++) {
			sb.append((int) a[i]- 64 + " ");
		}
		System.out.println(sb.toString());
	}

}
