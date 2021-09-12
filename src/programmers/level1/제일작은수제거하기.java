package programmers.level1;

public class 제일작은수제거하기 {
    public static int[] solution(int[] arr){
        if (arr.length == 1){
            int[] res = {-1};
            return res;
        }
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        int[] res = new int[arr.length-1];
        int x = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] != min){
                res[x++] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {4, 3, 2, 1};
        System.out.println(solution(arr));
    }
}
