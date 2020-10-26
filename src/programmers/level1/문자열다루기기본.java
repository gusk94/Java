package programmers.level1;

public class 문자열다루기기본 {
    public static boolean solution(String s){
        if (s.length() == 4 || s.length() == 6){
            boolean flag = true;
            for (int i=0;i<s.length();i++){
                if (!Character.isDigit(s.charAt(i))){
                    flag = false;
                    break;
                }
            }
            if (flag) return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(solution("a234"));
    }
}
