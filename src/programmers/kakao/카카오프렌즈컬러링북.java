package programmers.kakao;

import java.util.*;

public class 카카오프렌즈컬러링북 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static boolean check(int x, int y, int m, int n){
        if (0 <= x && x < m && 0 <= y && y < n) return true;
        return false;
    }

    public static int bfs(int x, int y, int m, int n, int[][] picture, boolean[][] visit){
        int cnt = 1;
        Queue<Node> queue  = new LinkedList<>();
        queue.add(new Node(x, y));
        while (!queue.isEmpty()){
            Node node = queue.poll();
            for (int i=0;i<4;i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (check(nx, ny, m, n) && picture[node.x][node.y] == picture[nx][ny] && !visit[nx][ny]){
                    queue.add(new Node(nx, ny));
                    visit[nx][ny] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        boolean[][] visit = new boolean[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                visit[i][j] = false;
            }
        }

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (!visit[i][j] && picture[i][j] > 0){
                    visit[i][j] = true;
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, bfs(i, j, m, n, picture, visit));
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println(solution(6, 4, picture));
    }

}

class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}