import java.io.*;
import java.util.StringTokenizer;

public class password {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int p = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());
		System.out.println(p-k+1);
	}

}
