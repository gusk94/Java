package baekjoon;

import java.io.*;

public class s_9012 {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.charAt(0) == ')'){
                sb.append("NO\n");
                continue;
            }
            int cnt = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    cnt++;
                }
                if (cnt > 0 && input.charAt(j) == ')') {
                    cnt--;
                    if (cnt < 0){
                        break;
                    }
                } else if (cnt <= 0 && input.charAt(j) == ')') {
                    cnt--;
                    break;
                }
            }
            if (cnt != 0) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}
