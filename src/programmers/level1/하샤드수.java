package programmers.level1;

public class 하샤드수 {
    public static boolean solution(int x) {
        int num = x;
        int s = 0;
        while (num > 0){
            s += num%10;
            num /= 10;
        }
        if (x % s == 0)return true;
        else return false;
    }

    public static void main(String[] args){
        solution(18);
    }
}
