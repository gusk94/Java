package programmers.level1;

public class 최대공약수와최소공배수 {
    public static int[] solution(int n, int m) {
        int[] ans = new int[2];
        int mvalue = 0;
        if (n > m) mvalue = m;
        else mvalue = n;
        int x = 0;
        for (int i=mvalue;i>0;i--){
            if (n%i == 0 && m%i == 0){
                x = i;
                break;
            }
        }
        ans[0] = x;
        int y = x*(n/x)*(m/x);
        ans[1] = y;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 12));
    }
}
