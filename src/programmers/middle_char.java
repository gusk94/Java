package programmers;

public class middle_char {
    public static String solution(String s){
        int length = s.length();
        String ans;
        if (length % 2 == 1){
            ans = Character.toString(s.charAt(length/2));
        } else {
            char a = s.charAt(length/2-1);
            char b = s.charAt(length/2);
            ans = Character.toString(a) + Character.toString(b);
        }
        return ans;
    };

    public static void main(String[] args){
//        String s = "abcde";
        String s = "qwer";
        System.out.println(solution(s));
    }
}
