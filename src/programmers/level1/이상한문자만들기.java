package programmers.level1;

public class 이상한문자만들기 {
    public static String solution(String s){
        StringBuffer sb = new StringBuffer();
        int x = 0;
        for (int i=0;i<s.length();i++){
            int tmp = (int) s.charAt(i);
            if (s.charAt(i) == ' '){
                x = 0;
                sb.append(" ");
                continue;
            }
            char output;
            if (x%2 == 1){
                //대문자 -> 소문자 (toLowerCase())
                if (65 <= tmp && tmp <= 90){
                    output = (char)(tmp + 32);
                } else {
                    output = (char)tmp;
                }
                sb.append(Character.toString(output));
            } else{
                // toUpperCase()
                if (97 <= tmp && tmp <= 122){
                    output = (char) (tmp - 32);
                }else{
                    output = (char)tmp;
                }
                sb.append(Character.toString(output));
            }
            x += 1;
        }
        String res = sb.toString();
        return res;
    }

    public static void main(String[] args){
        solution("try hello world");
    }
}
