package programmers.level1;

public class p2016 {
    public static String solution(int a, int b){
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int total = 0;
        for (int i=0;i<a-1;i++){
            total = total + month[i];
        }
        total = total + b;
        int c = total%7;
        return day[c];
    }

    public static void main(String[] args){
        System.out.println(solution(2, 28));
    }
}
