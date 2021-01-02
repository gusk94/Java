package programmers.level1;

import java.util.Arrays;

public class 예산 {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int res = 0;
        int total = 0;
        for (int i=0;i<d.length;i++){
            if (total + d[i] <= budget){
                total += d[i];
                res++;
            } else break;
        }
        return res;
    }

    public static void main(String[] args){
        int[] d = {1, 3, 2, 5, 4};
        solution(d, 9);
    }
}
