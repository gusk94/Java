package programmers.level1;

public class 짝수와홀수 {
    public static String solution(int num){
//        if (num%2 == 1 || num%2 == -1) return "Odd";
//        else return "Even";
        return (num%2 == 1 || num%2 == -1) ? "Odd":"Even";
    }

    public static void main(String[] args){
        solution(3);
    }
}
