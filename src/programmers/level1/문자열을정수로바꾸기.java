package programmers.level1;

import java.util.ArrayList;

public class 문자열을정수로바꾸기 {
    public static int solution(String s) {
        ArrayList<String> al = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if (x == '+' || x == '-'){
                if (sb.length() >= 1) {
                    al.add(sb.toString());
                    sb = new StringBuffer();
                }
                al.add(Character.toString(x));
            } else {
                sb.append(Character.toString(x));
            }
        }
        al.add(sb.toString());
        int res = 0;
        int i = 0;
        while (i < al.size()){
            if (al.get(i).equals("+") && i+1 < al.size()) {res += Integer.parseInt(al.get(i+1));i+= 2;}
            else if(al.get(i).equals("-") && i+1 < al.size()) {res -= Integer.parseInt(al.get(i+1));i += 2;}
            else {res = Integer.parseInt(al.get(i)); i++;}
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution("12-34"));
    }
}
