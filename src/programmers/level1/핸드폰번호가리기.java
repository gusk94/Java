package programmers.level1;

public class 핸드폰번호가리기 {
    public static String solution(String phone_number){
        int x = phone_number.length() - 4;
        StringBuffer res = new StringBuffer();
        for (int i=0;i<phone_number.length();i++){
            if (i < x){
                res.append("*");
            }else res.append(Character.toString(phone_number.charAt(i)));
        }
        String ans = res.toString();
        return ans;
    }

    public static void main(String[] args) {
        solution("1111111111");
    }
}
