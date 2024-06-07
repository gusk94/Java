package baekjoon;

import java.io.*;
import java.util.*;

public class s_9019 {
    static int res;

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 시작
            String[] commands = new String[10000];
            boolean[] visited = new boolean[10000];
            visited[a] = true;
            commands[a] = "";

            Queue<Integer> queue = new LinkedList<>();
            queue.add(a);
            while (!queue.isEmpty()){
                int x = queue.poll();
                int xD = (x * 2) % 10000;
                int xS = x == 0 ? 9999 : x - 1;
                int xL = (x/1000) + (x%1000)*10;
                int xR = (x%10)*1000 + (x/10);

                if (!visited[xD]){
                    commands[xD] = commands[x] + "D";
                    visited[xD] = true;
                    queue.add(xD);
                }
                if (!visited[xS]){
                    commands[xS] = commands[x] + "S";
                    visited[xS] = true;
                    queue.add(xS);
                }
                if (!visited[xL]){
                    commands[xL] = commands[x] + "L";
                    visited[xL] = true;
                    queue.add(xL);
                }
                if (!visited[xR]){
                    commands[xR] = commands[x] + "R";
                    visited[xR] = true;
                    queue.add(xR);
                }
            }
            System.out.println(commands[b]);
        }
    }
}
