import java.io.*;
import java.util.StringTokenizer;

public class caln {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] cal = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int t=1;t<=n;t++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			String x = stk.nextToken();
			if (cal[Integer.parseInt(x.substring(4, 6))] >= Integer.parseInt(x.substring(6,8))) {
				System.out.println("#" + t + " " + x.substring(0,4)+"/"+x.substring(4,6)+"/"+x.substring(6,8));
				} else {
					System.out.println("#"+t+" "+-1);
				}
			}
		}
}