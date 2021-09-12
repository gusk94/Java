package programmers.level2;

public class n개의최소공배수 {
    public static int solve(int a, int b){
        int min = Math.min(a, b);
        int re = 1;
        for (int i=min; i>0; i--){
            if (a%i == 0 && b%i == 0){
                re = i;
                break;
            }
        }
        return re*(a/re)*(b/re);
    }

    public static int solution(int[] arr){
        int res = arr[0];
        for (int i=1;i<arr.length;i++){
            res = solve(res, arr[i]);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 4};
        solution(arr);
    }
}
