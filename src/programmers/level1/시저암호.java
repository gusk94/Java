package programmers.level1;

public class 시저암호 {
    public static String solution(String s, int n){
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' '){
                sb.append(Character.toString(s.charAt(i)));
            }else{
                int tmp = (int) s.charAt(i);
                int t = tmp + n;
                if (65 <= tmp && tmp <= 90 && t > 90){
                    t = t - 26;
                } else if (97 <= tmp && tmp <= 122 && t > 122){
                    t = t - 26;
                }
                sb.append(Character.toString((char) t));
            }
        }
        String res = sb.toString();
        return res;
    }

    public static void main(String[] args){
        solution("AT", 1);
    }
}
