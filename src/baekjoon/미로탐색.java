package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 백준 제출 시 -> Main
public class 미로탐색 {

    static int n, m;
    static int[][] board = new int[101][101];
    static boolean[][] visit = new boolean[101][101];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i=0;i<n;i++){
            String s = br.readLine();
            for (int j=0;j<m;j++){
                board[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
                visit[i][j] = false;
            }
        }
        System.out.println(bfs(0, 0));
    }

    public static int bfs(int s, int e){
        visit[s][e] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(s, e, 0));

        while (!queue.isEmpty()){
            Node node = queue.poll();
            for (int i=0;i<4;i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < m){
                    if (board[nx][ny] == 1 && !visit[nx][ny]){
                        if (nx == n-1 && ny == m-1){
                            return node.cnt + 2;
                        }
                        queue.add(new Node(nx, ny, node.cnt+1));
                        visit[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}

class Node{
    int x;
    int y;
    int cnt;

    Node(int x, int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
