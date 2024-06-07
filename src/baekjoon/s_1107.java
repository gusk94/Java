package baekjoon;

import java.io.*;
import java.util.*;

public class s_1107 {
    public static int res;

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());

        res = Math.abs(Integer.parseInt(n)-100);

        if (m > 0){
            int[] remote = new int[10];
            st = new StringTokenizer(br.readLine());
            // 고장난 버튼
            for (int i=0;i<m;i++){
                remote[Integer.parseInt(st.nextToken())] = 1;
            }

            // 돌면서 가장 가까운 수 찾기
            for (int i=0;i<=999999;i++) {
                String snum = String.valueOf(i);
                boolean chk = false;
                for (int j=0;j<snum.length();j++){
                    if (remote[snum.charAt(j)-'0'] == 1){
                        chk = true;
                        break;
                    }
                };
                if (!chk){
                    res = Math.min(res, snum.length()+Math.abs(Integer.parseInt(n)-i));
                }
            }
        } else {
            res = Math.min(res, n.length());
        }

        if ("100".equals(n)) res = 0;

        System.out.println(res);
    }
}
