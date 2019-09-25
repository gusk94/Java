import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class middle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine());
		ArrayList<Integer> ns = new ArrayList<Integer>();
		while (stk.hasMoreTokens()) {
			int i = Integer.parseInt(stk.nextToken());
			ns.add(i);
		}
		ns.sort(null);
		int x = ns.size();
		x = x/2;
		System.out.println(ns.get(x));
	}

}
