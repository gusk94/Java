package programmers.level1;

public class 콜라츠추측 {
    public static int solution(long num){
        int res = 0;
        while (num > 1){
            if (res > 500){
                res = -1;
                break;
            }
            if (num%2 == 1){
                num = num*3 + 1;
            } else num /= 2;
            res++;
        }
        return res;
    }

    public static void main(String[] args){
        solution(626331);
    }
}
