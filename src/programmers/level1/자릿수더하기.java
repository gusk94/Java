package programmers.level1;

public class 자릿수더하기 {
    public static int solution(int n){
        int res = 0;
        while (n > 0) {
            res += n%10;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(solution(987));
    }
}
