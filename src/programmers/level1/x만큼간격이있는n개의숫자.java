package programmers.level1;

public class x만큼간격이있는n개의숫자 {
    public static long[] solution(int x, int n){
        long[] ans = new long[n];
        long num = x;
        for (int i=0;i<n;i++){
            ans[i] = num;
            num += x;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(solution(2, 5));
    }
}
