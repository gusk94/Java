package baekjoon;

import java.io.*;
import java.util.*;

public class s_15649 {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[] out = new char[2*m];

        for (int x=1;x<2*m;x+=2) out[x]= ' ';
        out[2*m-1] = '\n';

        permutation(n, out, new boolean[n+1], 0, m);

        System.out.print(sb);

    }

    public static void permutation(int n, char[] out, boolean[] visited, int depth, int r){
        if (depth == r){
            sb.append(out);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visited[i]){
                visited[i] = true;
                out[depth*2] = (char)(i+'0');
                permutation(n, out, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
