package programmers.level1;

public class 약수의합 {
    public static int solution(int n){
        int res = 0;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                res += i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(solution(12));
    }
}
