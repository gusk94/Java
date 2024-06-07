package baekjoon;

import java.io.*;
import java.util.*;

public class s_7569 {
    public static int res, m, n, h;
    public static int[][][] board;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dh = {0, 0, 0, 0, -1, 1};
    static Queue<tNode> queue;

    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();

        board = new int[n][m][h];

        for (int k=0;k<h;k++){
            for (int i=0;i<n;i++){
                StringTokenizer nst = new StringTokenizer(br.readLine());
                for (int j=0;j<m;j++){
                    board[i][j][k] = Integer.parseInt(nst.nextToken());
                    if (board[i][j][k] == 1) queue.add(new tNode(i, j, k, 0));
                }
            }
        }
        res = 0;
        bfs();

        for (int k=0;k<h;k++){
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    if (board[i][j][k] == 0){
                        res = -1;
                        break;
                    }
                }
                if (res == -1) break;
            }
            if (res == -1) break;
        }
        System.out.println(res);
    }
    public static int bfs(){
        while (!queue.isEmpty()){
            tNode tomato = queue.poll();
            res = Math.max(res, tomato.day);
            for (int i=0;i<6;i++){
                int nx = tomato.x + dx[i];
                int ny = tomato.y + dy[i];
                int nh = tomato.h + dh[i];
                if (0 <= nx && nx < n && 0 <= ny && ny < m && 0 <= nh && nh < h){
                    if (board[nx][ny][nh] == 0){
                        queue.add(new tNode(nx, ny, nh, tomato.day+1));
                        board[nx][ny][nh] = 1;
                    }
                }
            }
        }
        return -1;
    }

}

class tNode{
    int x;
    int y;
    int h;
    int day;

    tNode(int x, int y, int h, int day){
        this.x = x;
        this.y = y;
        this.h = h;
        this.day = day;
    }
}
