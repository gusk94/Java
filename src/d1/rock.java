package d1;

import java.io.*;
import java.util.StringTokenizer;

public class rock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sbr = new StringTokenizer(br.readLine());
		char[][] winner = new char[4][4];
		winner[1][2] = 'B';
		winner[2][1] = 'A';
		winner[2][3] = 'B';
		winner[3][2] = 'A';
		winner[1][3] = 'A';
		winner[3][1] = 'B';
		int a = Integer.parseInt(sbr.nextToken());
		int b = Integer.parseInt(sbr.nextToken());
		System.out.println(winner[a][b]);
	}

}
