package programmers.level1;

public class 정수제곱근판별 {
    public static long solution(long n){
//        double na = Math.sqrt(n);
//        if (na%1 == 0.0){
//            return (int) (na+1) * (int) (na+1);
//        } else {
//            return -1;
//        }
        long ans = -1;
        for (long i=1;i<=n;i++){
            if (i*i == n){
                ans = (i+1)*(i+1);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(solution(1));
    }
}
