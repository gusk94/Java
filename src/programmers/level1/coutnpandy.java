package programmers.level1;

public class coutnpandy {
    public static boolean solution(String s){
        int count_p = 0;
        int count_y = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                count_p++;
            }else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                count_y++;
            }
        }
        if (count_p == count_y){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String s = "pPoooyY";
        System.out.println(solution(s));
    }
}
