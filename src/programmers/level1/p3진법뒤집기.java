package programmers.level1;

public class p3진법뒤집기 {
    public static int solution(int n) {
        int res = 0;
        int[] nums = new int[100000000];
        int i = 0;
        while (n >= 3){
            nums[i] = n%3;
            n = n/3;
            i += 1;
        }
        nums[i] = n;
        int j = 0;
        for (int x=i;x>=0;x--){
            res = res + nums[x]*(int)Math.pow(3, j);
            j += 1;
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(solution(3));
    }
}
