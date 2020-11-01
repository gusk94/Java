package programmers.level1;

public class 크레인인형뽑기게임 {
    public static int solution(int[][] board, int[] moves){
        int size = board.length;
        int[] basket = new int[size*size];
        int idx = 0;
        int res = 0;
        for (int i=0;i<moves.length;i++){
            int move = moves[i];
            for (int j=0;j<board.length;j++){
                if (board[j][move-1] != 0){
                    if (idx > 0 && basket[idx-1] == board[j][move-1]){
                        basket[idx] = 0;
                        board[j][move-1] = 0;
                        res += 2;
                        idx--;
                        break;
                    }
                    basket[idx] = board[j][move-1];
                    board[j][move-1] = 0;
                    idx++;
                    break;
                }
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args){
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        solution(board, moves);
    }
}
