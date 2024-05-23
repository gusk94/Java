package baekjoon;

import java.io.*;
import java.util.*;

// 백준 제출 시 -> Main
public class s_2579 {

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        if (n > 1){
            dp[1] = Math.max(arr[1], arr[0]+arr[1]);
        }
        if (n > 2){
            dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
        }

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-3]+arr[i-1]+arr[i]);
        }

        System.out.println(dp[n-1]);
    }
}
