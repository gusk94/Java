package baekjoon;

import java.io.*;

public class s_9663 {

    public static int res;
    public static int[] board;

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        res = 0;

        board = new int[n];
        nqueen(n, 0);
        System.out.println(res);
    }

    public static void nqueen(int n, int row){
        if (row == n){
            res++;
            return;
        }
        for (int col = 0; col < n; col++) {
            board[row] = col;
            if (chk(row)){
                nqueen(n, row + 1);
            }
        }
    }

    public static boolean chk(int i){
        for (int j=0;j<i;j++){
            if (board[i] == board[j])return false;
            if (Math.abs(i-j) == Math.abs(board[i]-board[j]))return false;
        }
        return true;
    }
}
