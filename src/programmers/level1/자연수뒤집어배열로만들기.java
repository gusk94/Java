package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n){
        long x = n;
        int i = 0;
        while (x > 0){
            x /= 10;
            i++;
        }
        int[] res = new int[i];
        int j = 0;
        while (i > j){
            res[j++] = (int)(n%10);
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args){
        solution(987654321);
    }
}
