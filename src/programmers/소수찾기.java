package programmers;

public class 소수찾기 {
//    에라토스테네스의 체
    public static int solution(int n) {
        if (n<=1) return 0;
        int res = n-1;
        boolean[] primearray = new boolean[n+1];
        for (int i=2;i<=n;i++){
            primearray[i] = true;
        }
        for (int i=2;i*i<=n;i++){
            if (primearray[i]){
                for (int j=i*i;j<=n;j+=i){
                    if (primearray[j]){
                        res--;
                        primearray[j] = false;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(solution(1000000));
    }
}
