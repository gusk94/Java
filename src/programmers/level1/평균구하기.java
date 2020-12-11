package programmers.level1;

public class 평균구하기 {
    public static double solution(int[] arr){
        int total = 0;
        for (int i=0;i<arr.length;i++){
            total += arr[i];
        }
        return (double)total/arr.length;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        solution(arr);
    }
}
