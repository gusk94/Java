package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s_11726 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        dp[0] = 1;
        if (n > 1) dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }

        System.out.println(dp[n-1]);
    }
}
