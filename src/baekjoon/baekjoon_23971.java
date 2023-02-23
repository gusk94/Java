package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_23971 {

    // input
    static int h, w, n, m;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // input
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int cnt_h = 0;
        int cnt_w = 0;

        while (h > 0){
            h -= (n+1);
            cnt_h++;
        }
        while (w > 0){
            w -= (m+1);
            cnt_w++;
        }

        System.out.println(cnt_h*cnt_w);

    }
}
